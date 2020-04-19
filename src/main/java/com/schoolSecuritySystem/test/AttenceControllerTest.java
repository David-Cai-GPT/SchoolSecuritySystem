package com.schoolSecuritySystem.test;

import com.schoolSecuritySystem.dto.AttenceController.AttenceDto;
import com.schoolSecuritySystem.example.CaidaweiApplication;
import com.schoolSecuritySystem.service.AttenceService;
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
public class AttenceControllerTest {
    @Autowired
    private AttenceService attenceServiceImpl;

    @Test
    public void testNotAttenceList (){
        int role = 1;
        List<String> list = attenceServiceImpl.notAttenceList(role);
        System.out.println(list);
    }
    @Test
    public void tesNotAttence (){
        AttenceDto dto = new AttenceDto();
        dto.setName("老司机");
        dto.setCardId("1611060111");
        dto.setRole(1);
        attenceServiceImpl.attence(dto);
    }
}
