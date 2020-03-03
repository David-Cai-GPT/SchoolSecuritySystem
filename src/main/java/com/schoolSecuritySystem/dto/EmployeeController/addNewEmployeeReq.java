package com.schoolSecuritySystem.dto.EmployeeController;

public class addNewEmployeeReq {
    private String name;
    private int gender;
    private String work;
    private String mobilephone;
    private String employeeCardId;
    private String emergencyContact;
    private String emergencyContactMobilePhone;
    private String Email;
    private String address;
    private int role;

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
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

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getEmployeeCardId() {
        return employeeCardId;
    }

    public void setEmployeeCardId(String employeeCardId) {
        this.employeeCardId = employeeCardId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
