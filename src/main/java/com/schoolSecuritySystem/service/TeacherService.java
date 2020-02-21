package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.pojo.TeacherInfo;

import java.util.List;

public interface TeacherService {
    int getTeacherNum();
    List<TeacherInfo> getAllTeacherInfo();
}
