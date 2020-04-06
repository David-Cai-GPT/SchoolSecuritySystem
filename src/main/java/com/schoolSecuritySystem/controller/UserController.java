package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.UserController.NewUserInfoReq;
import com.schoolSecuritySystem.dto.UserController.UserLoginInfoReq;
import com.schoolSecuritySystem.pojo.UserInfo;
import com.schoolSecuritySystem.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/User")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    /**
     *用户注册
     */
    @ResponseBody
    @PostMapping("/register")
    public boolean NewUserRegister(@RequestBody NewUserInfoReq dto) {
        return userService.userRegister(dto); }

    /**
     *用户登录
     */
    @ResponseBody
    @PostMapping("/login")
    public boolean UserLogin(@RequestBody UserLoginInfoReq dto) {
        return userService.userLogin(dto);
    }

    /**
     *得到所有用户数量
     */
    @ResponseBody
    @PostMapping("/getAllUserNum")
    public int GetAllUserNum() { return userService.getAllUserNum(); }

    /**
     *得到用户信息
     */
    @ResponseBody
    @PostMapping("/getAllInformation")
    public List<UserInfo> GetAllUserInfomation() { return userService.getAllUserInfomation(); }
}
