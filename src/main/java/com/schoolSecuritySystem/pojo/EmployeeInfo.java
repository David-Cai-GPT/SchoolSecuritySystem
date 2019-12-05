package com.schoolSecuritySystem.pojo;

import java.io.Serializable;

public class EmployeeInfo implements Serializable {

    private Integer id;


    private String name;


    private Integer gender;


    private String work;


    private Integer mobliephone;


    private Integer employeecardid;


    private Integer address;


    private String emergencycontact;


    private Integer emergencycontactmobilephone;


    private String email;


    private Integer role;


    private static final long serialVersionUID = 1L;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public Integer getGender() {
        return gender;
    }


    public void setGender(Integer gender) {
        this.gender = gender;
    }


    public String getWork() {
        return work;
    }


    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }


    public Integer getMobliephone() {
        return mobliephone;
    }


    public void setMobliephone(Integer mobliephone) {
        this.mobliephone = mobliephone;
    }


    public Integer getEmployeecardid() {
        return employeecardid;
    }


    public void setEmployeecardid(Integer employeecardid) {
        this.employeecardid = employeecardid;
    }


    public Integer getAddress() {
        return address;
    }


    public void setAddress(Integer address) {
        this.address = address;
    }


    public String getEmergencycontact() {
        return emergencycontact;
    }


    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact == null ? null : emergencycontact.trim();
    }


    public Integer getEmergencycontactmobilephone() {
        return emergencycontactmobilephone;
    }


    public void setEmergencycontactmobilephone(Integer emergencycontactmobilephone) {
        this.emergencycontactmobilephone = emergencycontactmobilephone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }


    public Integer getRole() {
        return role;
    }


    public void setRole(Integer role) {
        this.role = role;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", work=").append(work);
        sb.append(", mobliephone=").append(mobliephone);
        sb.append(", employeecardid=").append(employeecardid);
        sb.append(", address=").append(address);
        sb.append(", emergencycontact=").append(emergencycontact);
        sb.append(", emergencycontactmobilephone=").append(emergencycontactmobilephone);
        sb.append(", email=").append(email);
        sb.append(", role=").append(role);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}