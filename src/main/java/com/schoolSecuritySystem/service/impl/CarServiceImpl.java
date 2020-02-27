package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.CarrecordMapper;
import com.schoolSecuritySystem.dto.CarController.CarInfoReq;
import com.schoolSecuritySystem.pojo.Carrecord;
import com.schoolSecuritySystem.pojo.CarrecordExample;
import com.schoolSecuritySystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarrecordMapper carrecordMapper;
    @Override
    public boolean carRecord(CarInfoReq dto) {
        Carrecord carrecord = new Carrecord();
        carrecord.setCarnumber(dto.getCarNumber());
        Date startDate = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String carStartTime = ft.format(startDate);
        carrecord.setCarintime(carStartTime);
        carrecord.setStatus("1");
        carrecordMapper.insert(carrecord);
        return true;
    }

    @Override
    public List<Carrecord> carInfo() {
        CarrecordExample carrecordExample = new CarrecordExample();
        CarrecordExample.Criteria criteria = carrecordExample.createCriteria();
        criteria.andIdIsNotNull();
        List<Carrecord> list = carrecordMapper.selectByExample(carrecordExample);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getStatus().equals("1")){
                list.get(i).setStatus("在园区内");
            } else {
                list.get(i).setStatus("不在园区内");
            }
        }
        return list;
    }
}
