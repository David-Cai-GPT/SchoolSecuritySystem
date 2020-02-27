package com.schoolSecuritySystem.controller;


import com.schoolSecuritySystem.dto.CarController.CarInfoReq;
import com.schoolSecuritySystem.pojo.Activityapply;
import com.schoolSecuritySystem.pojo.Carrecord;
import com.schoolSecuritySystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Car")
public class CarController {
    @Autowired
    private CarService carService;
    @ResponseBody
    @PostMapping("/carRecord")
    public boolean CarRecord(@RequestBody CarInfoReq dto) { return carService.carRecord(dto); }

    @ResponseBody
    @PostMapping("/allCarInfo")
    public List<Carrecord> GetAllCarInfo() { return carService.carInfo(); }
}
