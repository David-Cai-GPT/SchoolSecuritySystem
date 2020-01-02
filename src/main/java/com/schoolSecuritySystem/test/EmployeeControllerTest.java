package com.schoolSecuritySystem.test;

import com.schoolSecuritySystem.example.CaidaweiApplication;
import com.schoolSecuritySystem.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CaidaweiApplication.class)
public class EmployeeControllerTest {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @Test
    public void testGetEmployeeNum(){
        int num = employeeService.getEmployeeNum();
        System.out.println(num);
    }
}
