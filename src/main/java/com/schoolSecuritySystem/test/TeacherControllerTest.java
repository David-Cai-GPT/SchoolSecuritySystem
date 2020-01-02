package com.schoolSecuritySystem.test;

import com.schoolSecuritySystem.example.CaidaweiApplication;
import com.schoolSecuritySystem.service.impl.TeacherServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CaidaweiApplication.class)
public class TeacherControllerTest {
    @Autowired
    private TeacherServiceImpl teacherService;
    @Test
    public void testGetTeacherNum(){
        int num = teacherService.getTeacherNum();
        System.out.println(num);
    }
}
