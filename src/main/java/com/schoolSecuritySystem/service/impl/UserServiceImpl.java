package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.UserInfoMapper;
import com.schoolSecuritySystem.dto.UserComtroller.NewUserInfoReq;
import com.schoolSecuritySystem.pojo.UserInfo;
import com.schoolSecuritySystem.pojo.UserInfoExample;
import com.schoolSecuritySystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public boolean userRegister(NewUserInfoReq dto) {
        String username = dto.getUserName();
        String password = dto.getPassword();
        int role = dto.getRole();
        boolean register = false;
        UserInfo userInfo = new UserInfo();
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<UserInfo> checkuser = userInfoMapper.selectByExample(userInfoExample);
        if(checkuser.size() == 0) {
            register = true;
            userInfo.setUsername(username);
            userInfo.setPassword(password);
            userInfo.setRole(role);
            userInfoMapper.insert(userInfo);
        }
        return register;
    }
}
