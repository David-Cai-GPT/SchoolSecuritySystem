package com.schoolSecuritySystem.pojo;

import java.io.Serializable;

public class StudentInfo implements Serializable {

    private Integer id;


    private String name;


    private Integer gender;


    private String academy;


    private String classroom;


    private Integer mobliephone;


    private Integer studentcardid;


    private Integer domitory;


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


    public String getAcademy() {
        return academy;
    }


    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }


    public String getClassroom() {
        return classroom;
    }


    public void setClassroom(String classroom) {
        this.classroom = classroom == null ? null : classroom.trim();
    }


    public Integer getMobliephone() {
        return mobliephone;
    }


    public void setMobliephone(Integer mobliephone) {
        this.mobliephone = mobliephone;
    }


    public Integer getStudentcardid() {
        return studentcardid;
    }


    public void setStudentcardid(Integer studentcardid) {
        this.studentcardid = studentcardid;
    }


    public Integer getDomitory() {
        return domitory;
    }

    public void setDomitory(Integer domitory) {
        this.domitory = domitory;
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
        sb.append(", academy=").append(academy);
        sb.append(", classroom=").append(classroom);
        sb.append(", mobliephone=").append(mobliephone);
        sb.append(", studentcardid=").append(studentcardid);
        sb.append(", domitory=").append(domitory);
        sb.append(", emergencycontact=").append(emergencycontact);
        sb.append(", emergencycontactmobilephone=").append(emergencycontactmobilephone);
        sb.append(", email=").append(email);
        sb.append(", role=").append(role);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}