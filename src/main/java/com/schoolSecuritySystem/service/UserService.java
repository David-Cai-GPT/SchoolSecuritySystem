package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.UserController.NewUserInfoReq;
import com.schoolSecuritySystem.dto.UserController.UserLoginInfoReq;
import com.schoolSecuritySystem.pojo.UserInfo;

import java.util.List;

public interface UserService {
    // 用户注册
    boolean userRegister(NewUserInfoReq dto);
    // 用户登录
    boolean userLogin(UserLoginInfoReq dto);
    // 获得所有用户数量
    int getAllUserNum();
    // 获得所有用户信息
    List<UserInfo> getAllUserInfomation();
}

