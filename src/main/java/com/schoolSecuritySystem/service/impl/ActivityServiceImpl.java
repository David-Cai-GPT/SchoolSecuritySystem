package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.ActivityapplyMapper;
import com.schoolSecuritySystem.dto.ActivityController.ApplyActivityInfoReq;
import com.schoolSecuritySystem.pojo.Activityapply;
import com.schoolSecuritySystem.pojo.ActivityapplyExample;
import com.schoolSecuritySystem.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityapplyMapper activityapplyMapper;
    @Override
    public boolean applyActivity(ApplyActivityInfoReq dto) {
        Activityapply activityapply = new Activityapply();
        activityapply.setActivityname(dto.getActivityName());
        Date startDate = dto.getStartDate();
        Date startTime = dto.getStartTime();
        Date endDate = dto.getEndDate();
        Date endTime = dto.getEndTime();
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat ft2 = new SimpleDateFormat("HH:mm:ss");
        String activityStartTime = ft1.format(startDate) + ' ' + ft2.format(startTime);
        String activityendTime = ft1.format(endDate) + ' ' + ft2.format(endTime);
        activityapply.setActivitystarttime(activityStartTime);
        activityapply.setActivityendtime(activityendTime);
        activityapply.setActivitydescription(dto.getActivityDescription());
        activityapply.setApplicantname(dto.getApplicantName());
        activityapply.setApplicanttel(dto.getApplicanttel());
        activityapply.setRank(dto.getRank());
        activityapply.setPlace(dto.getPlace());
        activityapply.setCollege(dto.getCollege());
        activityapply.setType(dto.getType());
        activityapplyMapper.insert(activityapply);
        return true;
    }

    @Override
    public List<Activityapply> getAllActivityInfo() {
        ActivityapplyExample activityapplyExample = new ActivityapplyExample();
        ActivityapplyExample.Criteria criteria = activityapplyExample.createCriteria();
        criteria.andNoIsNotNull();
        List<Activityapply> list = activityapplyMapper.selectByExample(activityapplyExample);
        return list;
    }
}
