package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.EmployeeInfoMapper;
import com.schoolSecuritySystem.dto.EmployeeController.addNewEmployeeReq;
import com.schoolSecuritySystem.pojo.EmployeeInfo;
import com.schoolSecuritySystem.pojo.EmployeeInfoExample;
import com.schoolSecuritySystem.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeInfoMapper employeeInfoMapper;
    private Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

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
            logger.info("已存在职工信息");
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

    @Override
    public boolean editEmployeeInfo(addNewEmployeeReq dto) {
        String employeeCardId = dto.getEmployeeCardId();
        EmployeeInfoExample employeeInfoExample = new EmployeeInfoExample();
        employeeInfoExample.createCriteria().andEmployeecardidEqualTo(employeeCardId);
        List<EmployeeInfo> list = employeeInfoMapper.selectByExample(employeeInfoExample);
        if(list.size() == 0){
            logger.info("没有找到相应的教师资料");
            return false;
        } else {
            EmployeeInfo employeeInfo = new EmployeeInfo();
            employeeInfo.setId(list.get(0).getId());
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
            employeeInfoMapper.updateByExample(employeeInfo, employeeInfoExample);
        }
        return true;
    }
}
