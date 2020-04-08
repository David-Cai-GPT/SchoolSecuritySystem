package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.CarRecordMapper;
import com.schoolSecuritySystem.dao.UserCarAccountInfoMapper;
import com.schoolSecuritySystem.pojo.CarRecord;
import com.schoolSecuritySystem.pojo.CarRecordExample;
import com.schoolSecuritySystem.pojo.UserCarAccountInfo;
import com.schoolSecuritySystem.pojo.UserCarAccountInfoExample;
import com.schoolSecuritySystem.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRecordMapper carRecordMapper;
    @Autowired
    private UserCarAccountInfoMapper userCarAccountInfoMapper;

    private Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Override
    public boolean carRecord(String carNumber) {
        CarRecord carrecord = new CarRecord();
        carrecord.setCarnumber(carNumber);
        Date startDate = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String carStartTime = ft.format(startDate);
        carrecord.setCarintime(carStartTime);
        carrecord.setStatus("1");
        UserCarAccountInfoExample userCarAccountInfoExample = new UserCarAccountInfoExample();
        userCarAccountInfoExample.createCriteria().andCarNumberEqualTo(carNumber);
        List<UserCarAccountInfo> list = userCarAccountInfoMapper.selectByExample(userCarAccountInfoExample);
        if(list.size() == 0){
            logger.info("临时车用户");
            carrecord.setCostmethod(1);
        } else {
            logger.info("校内用户车辆");
            carrecord.setCostmethod(0);
        }
        carRecordMapper.insert(carrecord);
        return true;
    }

    @Override
    public List<CarRecord> carInfo() {
        CarRecordExample carrecordExample = new CarRecordExample();
        CarRecordExample.Criteria criteria = carrecordExample.createCriteria();
        criteria.andIdIsNotNull();
        List<CarRecord> list = carRecordMapper.selectByExample(carrecordExample);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getStatus().equals("1")){
                list.get(i).setStatus("在园区内");
            } else {
                list.get(i).setStatus("不在园区内");
            }
        }
        return list;
    }

    @Override
    public double carOutRecord(String carNumber) throws ParseException {
        double p = 0.8; // 校内开卡用户折扣
        double cost = 0;
        CarRecord carrecord = new CarRecord();
        CarRecordExample carRecordExample = new CarRecordExample();
        CarRecordExample.Criteria criteria = carRecordExample.createCriteria();
        criteria.andCarnumberEqualTo(carNumber).andStatusEqualTo("1");
        List<CarRecord> list = carRecordMapper.selectByExample(carRecordExample);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long startTime = ft.parse(list.get(0).getCarintime()).getTime();
        Long endTime = new Date().getTime();
        Long duringTime = startTime - endTime;
        if(list.get(0).getCostmethod() == 1){
            logger.info("园区内车辆");
            cost = duringTime * 10 / 3600 * p;
            UserCarAccountInfoExample userCarAccountInfoExample = new UserCarAccountInfoExample();
            userCarAccountInfoExample.createCriteria().andCarNumberEqualTo(carNumber);
            UserCarAccountInfo userCarAccountInfo = new UserCarAccountInfo();
            userCarAccountInfo.setSurplus(userCarAccountInfo.getSurplus() - cost);
            userCarAccountInfoMapper.updateByExample(userCarAccountInfo, userCarAccountInfoExample);
        } else {
            cost = duringTime * 10 / 3600;
        }
        String carOutTime = ft.format(endTime);
        carrecord.setCarouttime(carOutTime);
        carrecord.setStatus("0");
        carrecord.setCost(cost);
        carRecordMapper.updateByExampleSelective(carrecord, carRecordExample);
        return cost;
    }

    @Override
    public int surpluspark() {
        int AllParkNumber = 200;// 总的停车位200
        CarRecordExample carrecordExample = new CarRecordExample();
        CarRecordExample.Criteria criteria = carrecordExample.createCriteria();
        criteria.andIdIsNotNull();
        List<CarRecord> list = carRecordMapper.selectByExample(carrecordExample);
        if(list.size() == AllParkNumber) {
            return 0;
        } else {
            return AllParkNumber - list.size();
        }
    }
}
