package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.StudentController.addNewStudentReq;
import com.schoolSecuritySystem.dto.TeacherController.addNewTeacherReq;
import com.schoolSecuritySystem.pojo.TeacherInfo;

import java.util.List;

public interface TeacherService {
    // 所有教师数量
    int getTeacherNum();
    // 获得所有教师信息
    List<TeacherInfo> getAllTeacherInfo();
    // 添加新的教师信息
    boolean addNewTeacher(addNewTeacherReq dto);
    // 编辑教师信息
    boolean editTeacherInfo(addNewTeacherReq dto);
}
