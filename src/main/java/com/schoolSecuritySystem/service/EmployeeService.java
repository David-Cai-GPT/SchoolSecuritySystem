package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.EmployeeController.addNewEmployeeReq;
import com.schoolSecuritySystem.pojo.EmployeeInfo;

import java.util.List;

public interface EmployeeService {
    // 获得职工数量
    int getEmployeeNum();
    // 获得所有职工信息
    List<EmployeeInfo> getEmployeeInfomation();
    // 添加新的职工信息
    boolean addNewEmployee(addNewEmployeeReq dto);
    // 编辑职工信息
    boolean editEmployeeInfo(addNewEmployeeReq dto);
}
