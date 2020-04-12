package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.userAccountController.newUserAccountDto;
import com.schoolSecuritySystem.pojo.UserCarAccountInfo;

import java.util.List;

public interface UserAccountService {
    // 创建新的充值用户
    public Boolean addNewUserAccount(newUserAccountDto dto);
    // 充值用户充值
    public Double UserAccountInvest(String userCardId,double money);
    // 用户缴费
    public Double UserAccountPay(String userCardId,double money);
    // 所有充值用户信息查询
    public List<UserCarAccountInfo> getAllUserAccountInfo();
}
