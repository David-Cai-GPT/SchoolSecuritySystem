package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.EmployeeController.addNewEmployeeReq;
import com.schoolSecuritySystem.pojo.EmployeeInfo;
import com.schoolSecuritySystem.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    /**
     *得到所有职员数量
     */
    @ResponseBody
    @PostMapping("/getAllEmployeeNum")
    public int getAllEmployeeNum(){ return employeeService.getEmployeeNum(); }

    /**
     *得到所有职员信息
     */
    @ResponseBody
    @PostMapping("/getAllEmployeeInfo")
    public List<EmployeeInfo> getAllEmployeeInfo(){ return employeeService.getEmployeeInfomation(); }

    /**
     *添加新的职员信息
     */
    @ResponseBody
    @PostMapping("/addNewEmployee")
    public boolean AddNewEmployee(@RequestBody addNewEmployeeReq dto) { return employeeService.addNewEmployee(dto); }

    /**
     * 修改职工信息
     */
    @ResponseBody
    @PostMapping("/editEmployeeInfo")
    public Boolean EditEmployeeInfo(@RequestBody addNewEmployeeReq dto) {return employeeService.editEmployeeInfo(dto); }
}
