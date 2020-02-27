package com.schoolSecuritySystem.dto.CarController;

import java.util.Date;
public class CarInfoReq {
    private String carNumber;
    private Date carInTime;
    private Date carOutTime;
    private String status;// 1为在校内 0为不在

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Date getCarInTime() {
        return carInTime;
    }

    public void setCarInTime(Date carInTime) {
        this.carInTime = carInTime;
    }

    public Date getCarOutTime() {
        return carOutTime;
    }

    public void setCarOutTime(Date carOutTime) {
        this.carOutTime = carOutTime;
    }
}
