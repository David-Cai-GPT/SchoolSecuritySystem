package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.StudentController.addNewStudentReq;
import com.schoolSecuritySystem.dto.TeacherController.addNewTeacherReq;
import com.schoolSecuritySystem.pojo.TeacherInfo;

import java.util.List;

public interface TeacherService {
    int getTeacherNum();
    List<TeacherInfo> getAllTeacherInfo();
    boolean addNewTeacher(addNewTeacherReq dto);
}
