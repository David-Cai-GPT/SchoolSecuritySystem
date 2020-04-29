package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.EntranceGuardDto.entranceGuardPeopleDto;
import com.schoolSecuritySystem.dto.EntranceGuardDto.newEntranceGuardDto;
import com.schoolSecuritySystem.pojo.EntranceGuardInfo;
import com.schoolSecuritySystem.pojo.EntranceGuardUserInfo;

import java.util.List;

public interface EntranceGuardService {
    // 增加新的门禁信息
    boolean addNewEntranceGuard(newEntranceGuardDto dto);
    // 为门禁添加权限
    boolean addEntranceGuardPeople(entranceGuardPeopleDto dto);
    // 查询所有门禁设施信息
    List<EntranceGuardInfo> allEntranceGuardInfo();
    // 查询单个门禁下权限信息
    List<EntranceGuardUserInfo> singleEntranceGuardInfo(String entranGuardNumber);
    // 删除单个门禁权限
    boolean deleteEntranceGuardPeople(String userCardId, String entranGuardNumber);
}
