package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.userAccountController.newUserAccountDto;
import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.pojo.UserCarAccountInfo;
import com.schoolSecuritySystem.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserCarAccountController {
    @Autowired
    private UserAccountService userAccountService;

    /**
     *添加新的充值用户信息
     */
    @ResponseBody
    @PostMapping("/addNewAccountUser")
    public boolean AddNewAccountUser(@RequestBody newUserAccountDto dto) { return userAccountService.addNewUserAccount(dto); }

    /**
     *用户充值
     */
    @ResponseBody
    @GetMapping("/userAccountInvest")
    public double UserAccountInvest(@RequestParam("user_CardId")String user_CardId, @RequestParam("money")double money) { return userAccountService.UserAccountInvest(user_CardId, money); }

    /**
     * 获得所有充值用户信息
     */
    @ResponseBody
    @GetMapping("/getAllUserAccountInfo")
    public List<UserCarAccountInfo> GetAllUserAccountInfo() { return userAccountService.getAllUserAccountInfo(); }
}
