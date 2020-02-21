package com.schoolSecuritySystem.test;

import com.schoolSecuritySystem.example.CaidaweiApplication;
import com.schoolSecuritySystem.pojo.UserInfo;
import com.schoolSecuritySystem.service.impl.UserServiceImpl;
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
public class UserControllerTest {
    @Autowired
    private UserServiceImpl userService;
    @Test
    public void testGetAllUserNum(){
        int num = userService.getAllUserNum();
        System.out.println(num);
    }

    @Test
    public void testGetAllUserInfomation(){
        List<UserInfo> list = userService.getAllUserInfomation();
        System.out.println(list);
    }
}
