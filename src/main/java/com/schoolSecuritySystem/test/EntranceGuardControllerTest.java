package com.schoolSecuritySystem.test;

import com.schoolSecuritySystem.dto.EntranceGuardDto.entranceGuardPeopleDto;
import com.schoolSecuritySystem.dto.EntranceGuardDto.newEntranceGuardDto;
import com.schoolSecuritySystem.example.CaidaweiApplication;
import com.schoolSecuritySystem.service.EntranceGuardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CaidaweiApplication.class)
public class EntranceGuardControllerTest {
    @Autowired
    private EntranceGuardService entranceGuardServicelImpl;

    @Test
    public void testAddNewEntranceGuard(){
        newEntranceGuardDto dto = new newEntranceGuardDto();
        dto.setEntranceGuardAddress("W6-02");
        dto.setEntranceGuardNumber("123456780");
        dto.setEntranceGuardResponse("caidawei");
        dto.setEntranceGuardStatus("正常");
        entranceGuardServicelImpl.addNewEntranceGuard(dto);
    }
    @Test
    public void testAddEntranceGuardPeople(){
        entranceGuardPeopleDto dto = new entranceGuardPeopleDto();
        dto.setEntranceGuardNumber("123456780");
        dto.setUserCardId("1611060111");
        dto.setUserMobile("13819177116");
        dto.setUserName("xiaohong");
        dto.setUserRole("学生");
        entranceGuardServicelImpl.addEntranceGuardPeople(dto);
    }
}
