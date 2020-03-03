package com.schoolSecuritySystem.dto.TeacherController;

public class addNewTeacherReq {
    private String name;
    private int gender;
    private String academy;
    private String mobilephone;
    private String teacherCardId;
    private String address;
    private String emergencyContact;
    private String emergencyContactMobilePhone;
    private String Email;
    private int role;
    private String work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getTeacherCardId() {
        return teacherCardId;
    }

    public void setTeacherCardId(String teacherCardId) {
        this.teacherCardId = teacherCardId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContactMobilePhone() {
        return emergencyContactMobilePhone;
    }

    public void setEmergencyContactMobilePhone(String emergencyContactMobilePhone) {
        this.emergencyContactMobilePhone = emergencyContactMobilePhone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
