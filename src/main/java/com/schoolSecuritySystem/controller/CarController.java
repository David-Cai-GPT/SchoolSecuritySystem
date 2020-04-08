package com.schoolSecuritySystem.controller;


import com.schoolSecuritySystem.pojo.CarRecord;
import com.schoolSecuritySystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping(value = "/Car")
public class CarController {
    @Autowired
    private CarService carService;

    /**
     *车辆入园记录
     */
    @ResponseBody
    @PostMapping("/carRecord")
    public boolean CarRecord(@RequestBody String carNumber) { return carService.carRecord(carNumber); }

    @ResponseBody
    @PostMapping("/allCarInfo")
    public List<CarRecord> GetAllCarInfo() { return carService.carInfo(); }

    @ResponseBody
    @PostMapping("/carOutRecord")
    public double CarOutRecord(@RequestBody String carNumber) throws ParseException { return carService.carOutRecord(carNumber); }

    @ResponseBody
    @PostMapping("/surplusParkNumber")
    public int GetSurplusParkNumber() { return carService.surpluspark(); }
}
