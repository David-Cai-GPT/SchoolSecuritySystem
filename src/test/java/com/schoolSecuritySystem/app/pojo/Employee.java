package com.schoolSecuritySystem.app.pojo;

public class Employee {
    private int id;
    private String name;
    private int gender;
    private String work;
    private Long mobilePhone;
    private Long employeeCardId;
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

    public Long getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Long mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Long getEmployeeCardId() {
        return employeeCardId;
    }

    public void setEmployeeCardId(Long employeeCardId) {
        this.employeeCardId = employeeCardId;
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
