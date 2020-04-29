package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.EntranceGuardInfoMapper;
import com.schoolSecuritySystem.dao.EntranceGuardUserInfoMapper;
import com.schoolSecuritySystem.dao.EquipmentInfoMapper;
import com.schoolSecuritySystem.dto.EntranceGuardDto.entranceGuardPeopleDto;
import com.schoolSecuritySystem.dto.EntranceGuardDto.newEntranceGuardDto;
import com.schoolSecuritySystem.pojo.*;
import com.schoolSecuritySystem.service.EntranceGuardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EntranceGuardServiceImpl implements EntranceGuardService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private EntranceGuardInfoMapper entranceGuardInfoMapper;
    @Autowired
    private EntranceGuardUserInfoMapper entranceGuardUserInfoMapper;
    @Override
    public boolean addNewEntranceGuard(newEntranceGuardDto dto) {
        EntranceGuardInfoExample entranceGuardInfoExample = new EntranceGuardInfoExample();
        entranceGuardInfoExample.createCriteria().andEntranceGuardNumberEqualTo(dto.getEntranceGuardNumber());
        List<EntranceGuardInfo> list = entranceGuardInfoMapper.selectByExample(entranceGuardInfoExample);
        if(list.size() != 0){
            logger.info("门禁设备已存在");
            return false;
        } else{
            EntranceGuardInfo entranceGuardInfo = new EntranceGuardInfo();
            entranceGuardInfo.setEntranceGuardNumber(dto.getEntranceGuardNumber());
            entranceGuardInfo.setEntranceGuardAddress(dto.getEntranceGuardAddress());
            entranceGuardInfo.setEntranceGuardResponse(dto.getEntranceGuardResponse());
            entranceGuardInfo.setEntranceGuardStatus(dto.getEntranceGuardStatus());
            entranceGuardInfoMapper.insert(entranceGuardInfo);
            return true;
        }
    }

    @Override
    public boolean addEntranceGuardPeople(entranceGuardPeopleDto dto) {
            String entranceGuardNumber = dto.getEntranceGuardNumber();
            EntranceGuardInfoExample entranceGuardInfoExample = new EntranceGuardInfoExample();
            entranceGuardInfoExample.createCriteria().andEntranceGuardNumberEqualTo(entranceGuardNumber);
            List<EntranceGuardInfo> list = entranceGuardInfoMapper.selectByExample(entranceGuardInfoExample);
            EntranceGuardInfo entranceGuardInfo = list.get(0);
            EntranceGuardUserInfo entranceGuardUserInfo = new EntranceGuardUserInfo();
            entranceGuardUserInfo.setEntranceGuardId(entranceGuardInfo.getId().toString());
            entranceGuardUserInfo.setEntranceGuardNumber(dto.getEntranceGuardNumber());
            entranceGuardUserInfo.setUserCardid(dto.getUserCardId());
            entranceGuardUserInfo.setUserMobile(dto.getUserMobile());
            entranceGuardUserInfo.setUserRole(dto.getUserRole());
            entranceGuardUserInfo.setUserName(dto.getUserName());
            entranceGuardUserInfoMapper.insert(entranceGuardUserInfo);
            return true;
    }

    @Override
    public List<EntranceGuardInfo> allEntranceGuardInfo() {
        EntranceGuardInfoExample entranceGuardInfoExample = new EntranceGuardInfoExample();
        entranceGuardInfoExample.createCriteria().andIdIsNotNull();
        List<EntranceGuardInfo> list = entranceGuardInfoMapper.selectByExample(entranceGuardInfoExample);
        return list;
    }

    @Override
    public List<EntranceGuardUserInfo> singleEntranceGuardInfo(String entranGuardNumber) {
        EntranceGuardUserInfoExample entranceGuardUserInfoExample = new EntranceGuardUserInfoExample();
        entranceGuardUserInfoExample.createCriteria().andEntranceGuardNumberEqualTo(entranGuardNumber);
        List<EntranceGuardUserInfo> list = entranceGuardUserInfoMapper.selectByExample(entranceGuardUserInfoExample);
        return list;
    }

    @Override
    public boolean deleteEntranceGuardPeople(String userCardId, String entranGuardNumber) {
        EntranceGuardUserInfoExample entranceGuardUserInfoExample = new EntranceGuardUserInfoExample();
        entranceGuardUserInfoExample.createCriteria().andEntranceGuardNumberEqualTo(entranGuardNumber).andUserCardidEqualTo(userCardId);
        entranceGuardUserInfoMapper.deleteByExample(entranceGuardUserInfoExample);
        return true;
    }
}
