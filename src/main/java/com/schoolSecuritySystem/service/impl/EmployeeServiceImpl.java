package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.EmployeeInfoMapper;
import com.schoolSecuritySystem.pojo.EmployeeInfoExample;
import com.schoolSecuritySystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
