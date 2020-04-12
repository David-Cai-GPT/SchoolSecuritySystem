package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.pojo.CarRecord;

import java.text.ParseException;
import java.util.List;

public interface CarService {
    // 车辆入园记录
    boolean carRecord(String carNumber);
    // 获取所有车辆信息
    List<CarRecord> carInfo();
    // 车辆出园记录
    double carOutRecord(String carNumber) throws ParseException;
    // 返回车位数
    int surpluspark();
}
