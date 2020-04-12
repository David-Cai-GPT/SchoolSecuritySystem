package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.UserCarAccountInfoMapper;
import com.schoolSecuritySystem.dto.userAccountController.newUserAccountDto;
import com.schoolSecuritySystem.pojo.UserCarAccountInfo;
import com.schoolSecuritySystem.pojo.UserCarAccountInfoExample;
import com.schoolSecuritySystem.service.UserAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userAccountServiceImpl implements UserAccountService {
    private Logger logger = LoggerFactory.getLogger(userAccountServiceImpl.class);

    @Autowired
    private UserCarAccountInfoMapper userCarAccountInfoMapper;

    @Override
    public Boolean addNewUserAccount(newUserAccountDto dto) {
        UserCarAccountInfoExample userCarAccountInfoExample = new UserCarAccountInfoExample();
        userCarAccountInfoExample.createCriteria().andUserCardidEqualTo(dto.getUser_CardId());
        List<UserCarAccountInfo> list = userCarAccountInfoMapper.selectByExample(userCarAccountInfoExample);
        if(list.size() == 0){
            UserCarAccountInfo userCarAccountInfo = new UserCarAccountInfo();
            userCarAccountInfo.setUserCardid(dto.getUser_CardId());
            userCarAccountInfo.setCarNumber(dto.getCar_number());
            userCarAccountInfo.setSurplus(dto.getSurplus());
            userCarAccountInfoMapper.insert(userCarAccountInfo);
            return true;
        } else {
          logger.info("用户ID已存在");
        }
        return false;
    }

    @Override
    public Double UserAccountInvest(String userCardId,double money) {
        UserCarAccountInfoExample userCarAccountInfoExample = new UserCarAccountInfoExample();
        userCarAccountInfoExample.createCriteria().andUserCardidEqualTo(userCardId);
        List<UserCarAccountInfo> list = userCarAccountInfoMapper.selectByExample(userCarAccountInfoExample);
        if(list.size() != 0){
            double surplus = list.get(0).getSurplus() + money;
            UserCarAccountInfo userCarAccountInfo = new UserCarAccountInfo();
            userCarAccountInfo.setSurplus(surplus);
            userCarAccountInfo.setId(list.get(0).getId());
            userCarAccountInfo.setCarNumber(list.get(0).getCarNumber());
            userCarAccountInfo.setUserCardid(list.get(0).getUserCardid());
            userCarAccountInfoMapper.updateByExample(userCarAccountInfo, userCarAccountInfoExample);
            return surplus;
        } else {
            logger.error("用户ID不存在，充值失败");
        }
        return 0d;
    }

    @Override
    public Double UserAccountPay(String userCardId, double money) {
        UserCarAccountInfoExample userCarAccountInfoExample = new UserCarAccountInfoExample();
        userCarAccountInfoExample.createCriteria().andUserCardidEqualTo(userCardId);
        List<UserCarAccountInfo> list = userCarAccountInfoMapper.selectByExample(userCarAccountInfoExample);
        if(list.size() != 0){
            double surplus = list.get(0).getSurplus() - money;
            UserCarAccountInfo userCarAccountInfo = new UserCarAccountInfo();
            userCarAccountInfo.setSurplus(surplus);
            userCarAccountInfoMapper.updateByExample(userCarAccountInfo, userCarAccountInfoExample);
            return surplus;
        } else {
            logger.error("用户ID不存在，请使用其他方式支付");
        }
        return 0d;
    }

    @Override
    public List<UserCarAccountInfo> getAllUserAccountInfo() {
        UserCarAccountInfoExample userCarAccountInfoExample = new UserCarAccountInfoExample();
        userCarAccountInfoExample.createCriteria().andIdIsNotNull();
        List<UserCarAccountInfo> list = userCarAccountInfoMapper.selectByExample(userCarAccountInfoExample);
        return list;
    }
}
