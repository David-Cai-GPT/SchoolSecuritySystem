package com.schoolSecuritySystem.app.pojo;

public class Teacher {
    private int id;
    private String name;
    private int gender;
    private String work;
    private String academy;
    private Long mobilePhone;
    private Long teacherCardId;
    private String address;
    private String emergencyContact;
    private Long emergencyContactMobilePhone;
    private String Email;
    private int role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public Long getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Long mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Long getTeacherCardId() {
        return teacherCardId;
    }

    public void setTeacherCardId(Long teacherCardId) {
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

    public Long getEmergencyContactMobilePhone() {
        return emergencyContactMobilePhone;
    }

    public void setEmergencyContactMobilePhone(Long emergencyContactMobilePhone) {
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
}
