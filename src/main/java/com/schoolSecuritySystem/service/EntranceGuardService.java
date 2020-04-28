package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.EntranceGuardDto.newEntranceGuardDto;

public interface EntranceGuardService {
    // 增加新的门禁信息
    Boolean addNewEntranceGuard(newEntranceGuardDto dto);
}
