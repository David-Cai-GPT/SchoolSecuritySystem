package com.schoolSecuritySystem.app.pojo;

public class Student {
    private int id;
    private String name;
    private int gender;
    private String academy;
    private String classroom;
    private Long mobilePhone;
    private Long studentCardId;
    private int domitory;
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

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Long getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Long mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Long getStudentCardId() {
        return studentCardId;
    }

    public void setStudentCardId(Long studentCardId) {
        this.studentCardId = studentCardId;
    }

    public int getDomitory() {
        return domitory;
    }

    public void setDomitory(int domitory) {
        this.domitory = domitory;
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
