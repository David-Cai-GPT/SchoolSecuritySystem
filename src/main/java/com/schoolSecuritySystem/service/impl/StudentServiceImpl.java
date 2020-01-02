package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.StudentInfoMapper;
import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.pojo.StudentInfoExample;
import com.schoolSecuritySystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentInfoMapper studentInfoMapper;


    @Override
    public List<StudentInfo> getStudentList() {
        StudentInfoExample studentInfoExample = new StudentInfoExample();
        StudentInfoExample.Criteria criteria = studentInfoExample.createCriteria();
        criteria.andIdIsNotNull();
        List<StudentInfo> studentInfoList= studentInfoMapper.selectByExample(studentInfoExample);
        return studentInfoList;
    }

    @Override
    public int getStudentNum() {
        StudentInfoExample studentInfoExample =  new StudentInfoExample();
        StudentInfoExample.Criteria criteria = studentInfoExample.createCriteria();
        criteria.andIdIsNotNull();
        int num = studentInfoMapper.countByExample(studentInfoExample);
        return num;
    }
}
