package com.schoolSecuritySystem.service;


import com.schoolSecuritySystem.pojo.StudentInfo;

import java.util.List;

public interface StudentService {
    List<StudentInfo> getStudentList();
    int getStudentNum();
}