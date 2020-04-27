package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.EquipmentController.EquipmentInfoDto;
import com.schoolSecuritySystem.pojo.EquipmentInfo;
import com.schoolSecuritySystem.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/Equipment")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    /**
     * 获取所有设备信息列表
     * @return
     */
    @ResponseBody
    @PostMapping("/getAllEquipmentInfo")
    public List<EquipmentInfo> getAllEquipmentInfo(){ return equipmentService.getAllEquipmentInfo(); }

    /**
     * 纳管新的设备信息
     * @param dto
     * @return
     */
    @ResponseBody
    @PostMapping("/addNewEquipmentInfo")
    public boolean AddNewEquipmentInfo(EquipmentInfoDto dto){ return equipmentService.addNewEquipmentInfo(dto); }

    /**
     * 修改设备状态信息
     * @param equipmentNumber
     * @param equipmentStatus
     * @return
     */
    @ResponseBody
    @GetMapping("/modifyEquipmentInfo")
    public boolean ModifyEquipmentInfo(@RequestParam("equipmentNumber")String equipmentNumber,
                                       @RequestParam("equipmentStatus")String equipmentStatus){ return equipmentService.modifyEquipmentStatus(equipmentNumber,equipmentStatus); }
}
