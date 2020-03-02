package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.EquipmentInfoMapper;
import com.schoolSecuritySystem.pojo.EquipmentInfo;
import com.schoolSecuritySystem.pojo.EquipmentInfoExample;
import com.schoolSecuritySystem.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentInfoMapper equipmentInfoMapper;
    @Override
    public List<EquipmentInfo> getAllEquipmentInfo() {
        EquipmentInfoExample equipmentInfoExample = new EquipmentInfoExample();
        EquipmentInfoExample.Criteria criteria = equipmentInfoExample.createCriteria();
        criteria.andIdIsNotNull();
        List<EquipmentInfo> list = equipmentInfoMapper.selectByExample(equipmentInfoExample);
        return list;
    }
}
