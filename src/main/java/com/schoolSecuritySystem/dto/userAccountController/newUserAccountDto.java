package com.schoolSecuritySystem.dto.userAccountController;

public class newUserAccountDto {
    // 用户id卡号
    private String user_CardId;
    // 用户车牌号
    private String car_number;
    // 用户余额
    private double surplus;

    public String getUser_CardId() {
        return user_CardId;
    }

    public void setUser_CardId(String user_CardId) {
        this.user_CardId = user_CardId;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public double getSurplus() {
        return surplus;
    }

    public void setSurplus(double surplus) {
        this.surplus = surplus;
    }
}
