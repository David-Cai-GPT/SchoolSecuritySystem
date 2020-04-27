package com.schoolSecuritySystem.test;

import com.schoolSecuritySystem.dto.EquipmentController.EquipmentInfoDto;
import com.schoolSecuritySystem.example.CaidaweiApplication;
import com.schoolSecuritySystem.service.EmployeeService;
import com.schoolSecuritySystem.service.EquipmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CaidaweiApplication.class)
public class EquipmentControllerTest {
    @Autowired
    private EquipmentService equipmentServiceImpl;

    @Test
    public void testAddNewEquipment() {
        EquipmentInfoDto dto = new EquipmentInfoDto();
        dto.setEquipmentGroup("监控组");
        dto.setEquipmentStatus("损坏");
        dto.setEquipmentType("摄像头");
        dto.setEquipmentNumber("1234569");
        System.out.println(equipmentServiceImpl.addNewEquipmentInfo(dto));
    }

    @Test
    public void testModifyEquipmentInfo(){
        String equipmentNumber = new String("1234567");
        String equipmentStatus = new String("损坏");
        equipmentServiceImpl.modifyEquipmentStatus(equipmentNumber, equipmentStatus);
    }
}
