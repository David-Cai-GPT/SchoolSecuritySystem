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

    /**
     *入园车辆记录
     */
    @ResponseBody
    @PostMapping("/carRecord")
    public boolean CarRecord(@RequestBody CarInfoReq dto) { return carService.carRecord(dto); }

    /**
     *得到所有车辆信息
     */
    @ResponseBody
    @PostMapping("/allCarInfo")
    public List<Carrecord> GetAllCarInfo() { return carService.carInfo(); }

    /**
     *车辆出园记录
     */
    @ResponseBody
    @PostMapping("/carOutRecord")
    public boolean CarOutRecord(@RequestBody CarInfoReq dto) { return carService.carOutRecord(dto); }

    /**
     *停车场车位数
     */
    @ResponseBody
    @PostMapping("/surplusParkNumber")
    public int GetSurplusParkNumber() { return carService.surpluspark(); }
}
