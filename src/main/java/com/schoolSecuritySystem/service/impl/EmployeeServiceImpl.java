package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.EmployeeInfoMapper;
import com.schoolSecuritySystem.dto.EmployeeController.addNewEmployeeReq;
import com.schoolSecuritySystem.pojo.EmployeeInfo;
import com.schoolSecuritySystem.pojo.EmployeeInfoExample;
import com.schoolSecuritySystem.pojo.TeacherInfo;
import com.schoolSecuritySystem.pojo.TeacherInfoExample;
import com.schoolSecuritySystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeInfoMapper employeeInfoMapper;
    @Override
    public int getEmployeeNum() {
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        EmployeeInfoExample.Criteria criteria = employeeInfoExample.createCriteria();
        criteria.andIdIsNotNull();
        int num = employeeInfoMapper.countByExample(employeeInfoExample);
        return num;
    }

    @Override
    public List<EmployeeInfo> getEmployeeInfomation() {
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        EmployeeInfoExample.Criteria criteria = employeeInfoExample.createCriteria();
        criteria.andIdIsNotNull();
        List<EmployeeInfo> employeeList = employeeInfoMapper.selectByExample(employeeInfoExample);
        return employeeList;
    }

    @Override
    public boolean addNewEmployee(addNewEmployeeReq dto) {
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        EmployeeInfoExample.Criteria criteria = employeeInfoExample.createCriteria();
        criteria.andNameEqualTo(dto.getName());
        List<EmployeeInfo> list = employeeInfoMapper.selectByExample(employeeInfoExample);
        if(list.size() != 0){
            return false;
        } else {
            EmployeeInfo employeeInfo = new EmployeeInfo();
            employeeInfo.setName(dto.getName());
            employeeInfo.setGender(dto.getGender());
            employeeInfo.setMobliephone(dto.getMobilephone());
            employeeInfo.setEmployeecardid(dto.getEmployeeCardId());
            employeeInfo.setAddress(dto.getAddress());
            employeeInfo.setEmergencycontact(dto.getEmergencyContact());
            employeeInfo.setEmergencycontactmobilephone(dto.getEmergencyContactMobilePhone());
            employeeInfo.setEmail(dto.getEmail());
            employeeInfo.setRole(dto.getRole());
            employeeInfo.setWork(dto.getWork());
            employeeInfoMapper.insert(employeeInfo);
            return true;
        }
    }
}
