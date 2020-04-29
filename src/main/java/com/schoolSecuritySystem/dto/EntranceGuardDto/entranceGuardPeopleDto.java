package com.schoolSecuritySystem.dto.EntranceGuardDto;

public class entranceGuardPeopleDto {
    private String entranceGuardNumber;
    private String userCardId;
    private String userName;
    private String userRole;
    private String userMobile;

    public String getEntranceGuardNumber() {
        return entranceGuardNumber;
    }

    public void setEntranceGuardNumber(String entranceGuardNumber) {
        this.entranceGuardNumber = entranceGuardNumber;
    }

    public String getUserCardId() {
        return userCardId;
    }

    public void setUserCardId(String userCardId) {
        this.userCardId = userCardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
}
