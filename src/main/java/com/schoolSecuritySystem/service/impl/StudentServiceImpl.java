package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.StudentInfoMapper;
import com.schoolSecuritySystem.dto.StudentController.addNewStudentReq;
import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.pojo.StudentInfoExample;
import com.schoolSecuritySystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;

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

    @Override
    public boolean addNewStudent(addNewStudentReq dto) {
        StudentInfoExample studentInfoExample = new StudentInfoExample();
        StudentInfoExample.Criteria criteria = studentInfoExample.createCriteria();
        criteria.andNameEqualTo(dto.getName());
        List<StudentInfo> list = studentInfoMapper.selectByExample(studentInfoExample);
        if(list.size() != 0){
            return false;
        } else {
            StudentInfo studentInfo = new StudentInfo();
            studentInfo.setName(dto.getName());
            studentInfo.setGender(dto.getGender());
            studentInfo.setAcademy(dto.getAcademy());
            studentInfo.setClassroom(dto.getClassroom());
            studentInfo.setMobliephone(dto.getMobilephone());
            studentInfo.setStudentcardid(dto.getStudentCardId());
            studentInfo.setDomitory(dto.getDomitory());
            studentInfo.setEmergencycontact(dto.getEmergencyContact());
            studentInfo.setEmergencycontactmobilephone(dto.getEmergencyContactMobilePhone());
            studentInfo.setEmail(dto.getEmail());
            studentInfo.setRole(dto.getRole());
            studentInfoMapper.insert(studentInfo);
            return true;
        }
    }
}
