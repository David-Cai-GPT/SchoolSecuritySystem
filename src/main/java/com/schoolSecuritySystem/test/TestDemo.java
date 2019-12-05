package com.schoolSecuritySystem.test;


import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//启动Spring
public class TestDemo {
    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @Test
    public void test1(){
        List<StudentInfo> list = studentServiceImpl.getStudentList();
        System.out.println(list);
    }

}
