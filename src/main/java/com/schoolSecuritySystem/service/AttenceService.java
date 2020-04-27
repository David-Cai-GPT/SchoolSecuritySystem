package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.AttenceController.AttenceDto;
import com.schoolSecuritySystem.dto.AttenceController.ChartDataDto;
import com.schoolSecuritySystem.pojo.AttenceInfo;

import java.util.List;

public interface AttenceService {
    // 签到功能
    boolean attence (AttenceDto dto);
    // 还没有签到的人
    List notAttenceList(int role);
    // 签到信息统计
    ChartDataDto attenceAnalyse(int role);
}
