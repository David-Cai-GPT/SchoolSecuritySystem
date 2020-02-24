package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.ActivityController.ApplyActivityInfoReq;
import com.schoolSecuritySystem.pojo.Activityapply;

import java.util.List;

public interface ActivityService {
        boolean applyActivity(ApplyActivityInfoReq dto);
        List<Activityapply> getAllActivityInfo();
}
