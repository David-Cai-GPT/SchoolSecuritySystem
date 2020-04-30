package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.InvadeController.invadeInfoDto;
import com.schoolSecuritySystem.pojo.InvadeInfo;

import java.util.List;

public interface InvadeService {
    // 入侵报警发送邮件
    boolean invadeSendEmail();
    // 入侵报警信息录入
    boolean invadeInfoSave(invadeInfoDto dto);
    // 获取所有入侵信息
    List<InvadeInfo> getAllInvadeInfo();
}
