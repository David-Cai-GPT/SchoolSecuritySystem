package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/Employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @ResponseBody
    @PostMapping("/getAllEmployeeInfo")
    public int getAllEmployeeNum(){ return employeeService.getEmployeeNum(); }
}
