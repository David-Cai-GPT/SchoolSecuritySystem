package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.pojo.EmployeeInfo;

import java.util.List;

public interface EmployeeService {
    int getEmployeeNum();
    List<EmployeeInfo> getEmployeeInfomation();
}
