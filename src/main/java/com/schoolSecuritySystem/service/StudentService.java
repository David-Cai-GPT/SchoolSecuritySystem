package com.schoolSecuritySystem.service;


import com.schoolSecuritySystem.dto.StudentController.addNewStudentReq;
import com.schoolSecuritySystem.pojo.StudentInfo;

import java.util.List;

public interface StudentService {
    List<StudentInfo> getStudentList();
    int getStudentNum();
    boolean addNewStudent(addNewStudentReq dto);
}
