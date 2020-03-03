package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.TeacherInfoMapper;
import com.schoolSecuritySystem.dto.TeacherController.addNewTeacherReq;
import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.pojo.StudentInfoExample;
import com.schoolSecuritySystem.pojo.TeacherInfo;
import com.schoolSecuritySystem.pojo.TeacherInfoExample;
import com.schoolSecuritySystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<TeacherInfo> getAllTeacherInfo() {
        TeacherInfoExample teacherInfoExample = new TeacherInfoExample();
        TeacherInfoExample.Criteria criteria = teacherInfoExample.createCriteria();
        criteria.andIdIsNotNull();
        List<TeacherInfo> teacherInfoList = teacherInfoMapper.selectByExample(teacherInfoExample);
        return teacherInfoList;
    }

    @Override
    public boolean addNewTeacher(addNewTeacherReq dto) {
        TeacherInfoExample teacherInfoExample = new TeacherInfoExample();
        TeacherInfoExample.Criteria criteria = teacherInfoExample.createCriteria();
        criteria.andNameEqualTo(dto.getName());
        List<TeacherInfo> list = teacherInfoMapper.selectByExample(teacherInfoExample);
        if (list.size() != 0) {
            return false;
        } else {
            TeacherInfo teacherInfo = new TeacherInfo();
            teacherInfo.setName(dto.getName());
            teacherInfo.setGender(dto.getGender());
            teacherInfo.setAcademy(dto.getAcademy());
            teacherInfo.setMobliephone(dto.getMobilephone());
            teacherInfo.setTeachercardid(dto.getTeacherCardId());
            teacherInfo.setAddress(dto.getAddress());
            teacherInfo.setEmergencycontact(dto.getEmergencyContact());
            teacherInfo.setEmergencycontactmobilephone(dto.getEmergencyContactMobilePhone());
            teacherInfo.setEmail(dto.getEmail());
            teacherInfo.setRole(dto.getRole());
            teacherInfo.setWork(dto.getWork());
            teacherInfoMapper.insert(teacherInfo);
            return true;
        }
    }
}
