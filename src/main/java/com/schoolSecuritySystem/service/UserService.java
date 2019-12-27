package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.UserComtroller.NewUserInfoReq;

public interface UserService {
    boolean userRegister(NewUserInfoReq dto);
}
