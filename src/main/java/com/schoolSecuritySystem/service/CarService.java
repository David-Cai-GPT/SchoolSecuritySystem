package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.CarController.CarInfoReq;
import com.schoolSecuritySystem.pojo.Carrecord;

import java.util.List;

public interface CarService {
    boolean carRecord(CarInfoReq dto);
    List<Carrecord> carInfo();
}
