package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.pojo.EquipmentInfo;
import com.schoolSecuritySystem.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Equipment")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;
    @ResponseBody
    @PostMapping("/getAllEquipmentInfo")
    public List<EquipmentInfo> getAllEquipmentInfo(){ return equipmentService.getAllEquipmentInfo(); }
}
