package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewUserRegister {
    @Autowired
    private UserServiceImpl userServiceimpl;
    @ResponseBody
    @RequestMapping("/register")
    public boolean NewUserRegister(){
        String username = "jiangwenchao";
        String password = "123456";
        int role = 2;
        return userServiceimpl.userRegister(username,password,role);
    }
}
