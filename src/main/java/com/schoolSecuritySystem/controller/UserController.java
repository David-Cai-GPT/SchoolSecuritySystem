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

    @ResponseBody
    @PostMapping("/register")
    public boolean NewUserRegister(@RequestBody NewUserInfoReq dto) {
        return userService.userRegister(dto); }

    @ResponseBody
    @PostMapping("/login")
    public boolean UserLogin(@RequestBody UserLoginInfoReq dto) {
        return userService.userLogin(dto);
    }

    @ResponseBody
    @PostMapping("/getAllUserNum")
    public int GetAllUserNum() { return userService.getAllUserNum(); }

    @ResponseBody
    @PostMapping("/getAllInformation")
    public List<UserInfo> GetAllUserInfomation() { return userService.getAllUserInfomation(); }
}
