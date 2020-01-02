package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.TeacherInfoMapper;
import com.schoolSecuritySystem.pojo.TeacherInfoExample;
import com.schoolSecuritySystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherInfoMapper teacherInfoMapper;

    @Override
    public int getTeacherNum() {
        TeacherInfoExample teacherInfoExample = new TeacherInfoExample();
        TeacherInfoExample.Criteria criteria = teacherInfoExample.createCriteria();
        criteria.andIdIsNotNull();
        int num = teacherInfoMapper.countByExample(teacherInfoExample);
        return num;
    }
}
