package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.pojo.EmployeeInfo;
import com.schoolSecuritySystem.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @ResponseBody
    @PostMapping("/getAllEmployeeNum")
    public int getAllEmployeeNum(){ return employeeService.getEmployeeNum(); }

    @ResponseBody
    @PostMapping("/getAllEmployeeInfo")
    public List<EmployeeInfo> getAllEmployeeInfo(){ return employeeService.getEmployeeInfomation(); }
}
