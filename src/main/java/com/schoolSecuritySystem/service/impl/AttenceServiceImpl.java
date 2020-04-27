package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.AttenceInfoMapper;
import com.schoolSecuritySystem.dao.EmployeeInfoMapper;
import com.schoolSecuritySystem.dao.StudentInfoMapper;
import com.schoolSecuritySystem.dao.TeacherInfoMapper;
import com.schoolSecuritySystem.dto.AttenceController.AttenceDto;
import com.schoolSecuritySystem.dto.AttenceController.ChartDataDto;
import com.schoolSecuritySystem.pojo.*;
import com.schoolSecuritySystem.service.AttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

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

    @Override
    public ChartDataDto attenceAnalyse(int role) {
        ChartDataDto chartDataDto = new ChartDataDto();
        AttenceInfoExample attenceInfoExample = new AttenceInfoExample();
        Date date = new Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
        String attenceDate = ft1.format(date);
        attenceInfoExample.createCriteria().andIdIsNotNull().andDateEqualTo(attenceDate);
        if(role == 1){
            StudentInfoExample studentInfoExample = new StudentInfoExample();
            studentInfoExample.createCriteria().andIdIsNotNull();
            List<StudentInfo> studentList = studentInfoMapper.selectByExample(studentInfoExample);
            int allNumber = studentList.size();
            int notAttenceNum = notAttenceList(role).size();
            int attenceNum = allNumber - notAttenceNum;
            List columns = new ArrayList();
            columns.add("日期");
            columns.add("学生总数");
            columns.add("已签到学生");
            columns.add("未签到学生");
            chartDataDto.setColumns(columns);
            Map rowsMap = new HashMap();
            rowsMap.put("日期",attenceDate);
            rowsMap.put("学生总数",allNumber);
            rowsMap.put("已签到学生",attenceNum);
            rowsMap.put("未签到学生",notAttenceNum);
            List rows = new ArrayList();
            rows.add(rowsMap);
            chartDataDto.setRows(rows);
            return chartDataDto;
        } else if (role == 2){
            TeacherInfoExample teacherInfoExample = new TeacherInfoExample();
            teacherInfoExample.createCriteria().andIdIsNotNull();
            List<TeacherInfo> teacherList = teacherInfoMapper.selectByExample(teacherInfoExample);
            int allNumber = teacherList.size();
            int notAttenceNum = notAttenceList(role).size();
            int attenceNum = allNumber - notAttenceNum;
            List columns = new ArrayList();
            columns.add("日期");
            columns.add("教师总数");
            columns.add("已签到教师");
            columns.add("未签到教师");
            chartDataDto.setColumns(columns);
            Map rowsMap = new HashMap();
            rowsMap.put("日期",attenceDate);
            rowsMap.put("教师总数",allNumber);
            rowsMap.put("已签到教师",attenceNum);
            rowsMap.put("未签到教师",notAttenceNum);
            List rows = new ArrayList();
            rows.add(rowsMap);
            chartDataDto.setRows(rows);
            return chartDataDto;
        } else {
            EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
            employeeInfoExample.createCriteria().andIdIsNotNull();
            List<EmployeeInfo> employeeList = employeeInfoMapper.selectByExample(employeeInfoExample);
            int allNumber = employeeList.size();
            int notAttenceNum = notAttenceList(role).size();
            int attenceNum = allNumber - notAttenceNum;
            List columns = new ArrayList();
            columns.add("日期");
            columns.add("职工总数");
            columns.add("已签到职工");
            columns.add("未签到职工");
            chartDataDto.setColumns(columns);
            Map rowsMap = new HashMap();
            rowsMap.put("日期",attenceDate);
            rowsMap.put("职工总数",allNumber);
            rowsMap.put("已签到职工",attenceNum);
            rowsMap.put("未签到职工",notAttenceNum);
            List rows = new ArrayList();
            rows.add(rowsMap);
            chartDataDto.setRows(rows);
            return chartDataDto;
        }
    }
}
