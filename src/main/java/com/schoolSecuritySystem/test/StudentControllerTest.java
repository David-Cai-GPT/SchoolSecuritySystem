package com.schoolSecuritySystem.test;


import com.schoolSecuritySystem.example.CaidaweiApplication;
import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CaidaweiApplication.class)
//启动Spring
public class StudentControllerTest {
    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @Test
    public void testGetStudentList(){
        List<StudentInfo> list = studentServiceImpl.getStudentList();
        System.out.println(list);
    }

    @Test
    public void testGetStudentNum(){
        int num = studentServiceImpl.getStudentNum();
        System.out.println(num);
    }

}
