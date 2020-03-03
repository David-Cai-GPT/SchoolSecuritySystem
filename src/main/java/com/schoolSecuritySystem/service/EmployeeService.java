package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.EmployeeController.addNewEmployeeReq;
import com.schoolSecuritySystem.dto.TeacherController.addNewTeacherReq;
import com.schoolSecuritySystem.pojo.EmployeeInfo;

import java.util.List;

public interface EmployeeService {
    int getEmployeeNum();
    List<EmployeeInfo> getEmployeeInfomation();
    boolean addNewEmployee(addNewEmployeeReq dto);
}
