package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.AttenceInfoMapper;
import com.schoolSecuritySystem.dao.EmployeeInfoMapper;
import com.schoolSecuritySystem.dao.StudentInfoMapper;
import com.schoolSecuritySystem.dao.TeacherInfoMapper;
import com.schoolSecuritySystem.dto.AttenceController.AttenceDto;
import com.schoolSecuritySystem.pojo.*;
import com.schoolSecuritySystem.service.AttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class AttenceServiceImpl implements AttenceService {
    @Autowired
    private AttenceInfoMapper attenceInfoMapper;
    @Autowired
    private StudentInfoMapper studentInfoMapper;
    @Autowired
    private TeacherInfoMapper teacherInfoMapper;
    @Autowired
    private EmployeeInfoMapper employeeInfoMapper;
    @Override
    public boolean attence(AttenceDto dto) {
        AttenceInfo attenceInfo = new AttenceInfo();
        attenceInfo.setName(dto.getName());
        attenceInfo.setCardid(dto.getCardId());
        attenceInfo.setRole(dto.getRole());
        Date date = new Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat ft2 = new SimpleDateFormat("HH:mm:ss");
        String attenceDate = ft1.format(date);
        String attenceTime = ft2.format(date);
        attenceInfo.setDate(attenceDate);
        attenceInfo.setTime(attenceTime);
        attenceInfoMapper.insert(attenceInfo);
        return true;
    }

    @Override
    public List notAttenceList(int role) {
        AttenceInfoExample attenceInfoExample = new AttenceInfoExample();
        Date date = new Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat ft2 = new SimpleDateFormat("HH:mm:ss");
        String attenceDate = ft1.format(date);
        String attenceTime = ft2.format(date);
        attenceInfoExample.createCriteria().andIdIsNotNull().andDateEqualTo(attenceDate);
        List<AttenceInfo> attencedList = attenceInfoMapper.selectByExample(attenceInfoExample);
            if(role == 2){
                TeacherInfoExample teacherInfoExample = new TeacherInfoExample();
                teacherInfoExample.createCriteria().andIdIsNotNull();
                List<TeacherInfo> teacherList = teacherInfoMapper.selectByExample(teacherInfoExample);
                if(attencedList.size() == 0){
                    return teacherList;
                } else {
                    Iterator<TeacherInfo> it = teacherList.iterator();
                    while(it.hasNext()){
                        String name = it.next().getName();
                     for(AttenceInfo value : attencedList){
                         if(name.equals(value.getName()) == true) {
                             it.remove();
                             break;
                         }
                     }
                    }
                    return teacherList;
                }
            }
            if(role == 3){
               EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
            employeeInfoExample.createCriteria().andIdIsNotNull();
            List<EmployeeInfo> employeeList = employeeInfoMapper.selectByExample(employeeInfoExample);
            if(attencedList.size() == 0){
                return employeeList;
            } else {
                Iterator<EmployeeInfo> it = employeeList.iterator();
                while(it.hasNext()){
                    String name = it.next().getName();
                    for(AttenceInfo value : attencedList){
                        if(name.equals(value.getName()) == true) {
                            it.remove();
                            break;
                        }
                    }
                }
                return employeeList;
            }
        }
        if(role == 1){
            StudentInfoExample studentInfoExample = new StudentInfoExample();
            studentInfoExample.createCriteria().andIdIsNotNull();
            List<StudentInfo> studentList = studentInfoMapper.selectByExample(studentInfoExample);
            if(attencedList.size() == 0){
                return studentList;
            } else {
                Iterator<StudentInfo> it = studentList.iterator();
                while(it.hasNext()){
                    String name = it.next().getName();
                    for(AttenceInfo value : attencedList){
                        if(name.equals(value.getName()) == true) {
                            it.remove();
                            break;
                        }
                    }
                }
                return studentList;
            }
        }
        return null;
    }
}
