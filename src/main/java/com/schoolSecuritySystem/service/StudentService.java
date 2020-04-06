package com.schoolSecuritySystem.service;


import com.schoolSecuritySystem.dto.StudentController.addNewStudentReq;
import com.schoolSecuritySystem.pojo.StudentInfo;

import java.util.List;

public interface StudentService {
    // 得到所有学生信息
    List<StudentInfo> getStudentList();
    // 得到所有学生数量
    int getStudentNum();
    // 添加新的学生
    boolean addNewStudent(addNewStudentReq dto);
    // 修改学生信息
    boolean editStudentInfo(addNewStudentReq dto);
}
