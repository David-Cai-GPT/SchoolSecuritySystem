package com.schoolSecuritySystem.dto.EquipmentController;

public class EquipmentInfoDto {
    // 设备编号/型号
    private String equipmentNumber;
    // 设备类型
    private String equipmentType;
    // 设备状态
    private String equipmentStatus;
    // 设备分组
    private String equipmentGroup;

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public String getEquipmentGroup() {
        return equipmentGroup;
    }

    public void setEquipmentGroup(String equipmentGroup) {
        this.equipmentGroup = equipmentGroup;
    }
}
