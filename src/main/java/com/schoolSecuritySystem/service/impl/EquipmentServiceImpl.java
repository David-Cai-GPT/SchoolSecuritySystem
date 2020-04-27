package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.EquipmentInfoMapper;
import com.schoolSecuritySystem.dto.EquipmentController.EquipmentInfoDto;
import com.schoolSecuritySystem.pojo.EquipmentInfo;
import com.schoolSecuritySystem.pojo.EquipmentInfoExample;
import com.schoolSecuritySystem.service.EquipmentService;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipmentServiceImpl implements EquipmentService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private EquipmentInfoMapper equipmentInfoMapper;
    @Autowired
    private MailService mailService;
    @Override
    public List<EquipmentInfo> getAllEquipmentInfo() {
        EquipmentInfoExample equipmentInfoExample = new EquipmentInfoExample();
        EquipmentInfoExample.Criteria criteria = equipmentInfoExample.createCriteria();
        criteria.andIdIsNotNull();
        List<EquipmentInfo> list = equipmentInfoMapper.selectByExample(equipmentInfoExample);
        return list;
    }

    @Override
    public Boolean addNewEquipmentInfo(EquipmentInfoDto dto) {
        EquipmentInfo equipmentInfo = new EquipmentInfo();
        equipmentInfo.setEquipmentnumber(dto.getEquipmentNumber());
        equipmentInfo.setEquipmenttype(dto.getEquipmentType());
        equipmentInfo.setEquipmentgroup(dto.getEquipmentGroup());
        equipmentInfo.setEquipmentstatus(dto.getEquipmentStatus());
        EquipmentInfoExample equipmentInfoExample = new EquipmentInfoExample();
        equipmentInfoExample.createCriteria().andEquipmentnumberEqualTo(dto.getEquipmentNumber());
        List<EquipmentInfo> list =  equipmentInfoMapper.selectByExample(equipmentInfoExample);
        if(list.size() == 0){
            equipmentInfoMapper.insert(equipmentInfo);
        } else {
            logger.info("存储失败，数据库已含有相同编号的设备");
        }
        return null;
    }

    @Override
    public Boolean modifyEquipmentStatus(String equipmentNumber, String equipmentStatus) {
        EquipmentInfoExample equipmentInfoExample = new EquipmentInfoExample();
        equipmentInfoExample.createCriteria().andEquipmentnumberEqualTo(equipmentNumber);
        List<EquipmentInfo> list = equipmentInfoMapper.selectByExample(equipmentInfoExample);
        if(list.size() == 0){
            logger.info("错误，没有找到该设备");
            return false;
        } else {
            EquipmentInfo equipmentInfo = new EquipmentInfo();
            equipmentInfo.setEquipmentgroup(list.get(0).getEquipmentgroup());
            equipmentInfo.setEquipmenttype(list.get(0).getEquipmenttype());
            equipmentInfo.setId(list.get(0).getId());
            equipmentInfo.setEquipmentnumber(list.get(0).getEquipmentnumber());
            equipmentInfo.setEquipmentstatus(equipmentStatus);
            equipmentInfoMapper.updateByExample(equipmentInfo,equipmentInfoExample);
            return true;
        }
    }

    @Async("executor")
    @Scheduled(cron = "0 0 7 * * ?")
    @Override
    public List<EquipmentInfo> backEquipmentStatusBad() {
        EquipmentInfoExample equipmentInfoExample = new EquipmentInfoExample();
        equipmentInfoExample.createCriteria().andEquipmentstatusEqualTo("损坏");
        List<EquipmentInfo> list = equipmentInfoMapper.selectByExample(equipmentInfoExample);
        if(list.size() == 0){
            logger.info("所有设备运行正常");
        } else {
            StringBuilder temContent = new StringBuilder("设备编号：");
            for(EquipmentInfo value : list){
                temContent.append(value.getEquipmentnumber() + ',');
            }
            temContent.append("出现损坏现象，请及时维护。");
            String content = temContent.toString();
            String subject = new String("设备信息维护通知");
            mailService.sendSimpleMail("913995397@qq.com",subject,content);
        }
        return list;
    }
}
