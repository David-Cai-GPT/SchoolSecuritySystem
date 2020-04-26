package com.schoolSecuritySystem.test;

import com.schoolSecuritySystem.example.CaidaweiApplication;
import com.schoolSecuritySystem.service.impl.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CaidaweiApplication.class)
public class MailTest {
    @Autowired
    private MailService mailService;

    @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail("913995397@qq.com", "测试Test", "测试Test - 内容");
    }
}
