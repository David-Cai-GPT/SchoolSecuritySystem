package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.EquipmentController.EquipmentInfoDto;
import com.schoolSecuritySystem.pojo.EquipmentInfo;

import java.util.List;

public interface EquipmentService {
    // 获得所有设备信息
    List<EquipmentInfo> getAllEquipmentInfo();
    // 添加新的设备信息
    boolean addNewEquipmentInfo(EquipmentInfoDto dto);
    // 修改设备状态信息
    boolean modifyEquipmentStatus(String equipmentNumber, String equipmentStatus);
    // 查询设备信息并返回设被状态为损坏的设备信息
    List<EquipmentInfo> backEquipmentStatusBad();
}
