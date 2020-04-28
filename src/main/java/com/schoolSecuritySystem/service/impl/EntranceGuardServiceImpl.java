package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.EntranceGuardInfoMapper;
import com.schoolSecuritySystem.dto.EntranceGuardDto.newEntranceGuardDto;
import com.schoolSecuritySystem.pojo.EntranceGuardInfo;
import com.schoolSecuritySystem.pojo.EntranceGuardInfoExample;
import com.schoolSecuritySystem.service.EntranceGuardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EntranceGuardServiceImpl implements EntranceGuardService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private EntranceGuardInfoMapper entranceGuardInfoMapper;
    @Override
    public Boolean addNewEntranceGuard(newEntranceGuardDto dto) {
        EntranceGuardInfoExample entranceGuardInfoExample = new EntranceGuardInfoExample();
        entranceGuardInfoExample.createCriteria().andEntranceGuardNumberEqualTo(dto.getEntranceGuardNumber());
        List<EntranceGuardInfo> list = entranceGuardInfoMapper.selectByExample(entranceGuardInfoExample);
        if(list.size() == 0){
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
}
