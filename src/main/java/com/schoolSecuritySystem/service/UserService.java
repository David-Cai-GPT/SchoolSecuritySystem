package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.UserController.NewUserInfoReq;
import com.schoolSecuritySystem.dto.UserController.UserLoginInfoReq;
import com.schoolSecuritySystem.pojo.UserInfo;

import java.util.List;

public interface UserService {
    boolean userRegister(NewUserInfoReq dto);
    boolean userLogin(UserLoginInfoReq dto);
    int getAllUserNum();
    List<UserInfo> getAllUserInfomation();
}

