package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.UserComtroller.NewUserInfoReq;
import com.schoolSecuritySystem.dto.UserComtroller.UserLoginInfoReq;

public interface UserService {
    boolean userRegister(NewUserInfoReq dto);
    boolean userLogin(UserLoginInfoReq dto);
}

