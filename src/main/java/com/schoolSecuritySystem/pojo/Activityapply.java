package com.schoolSecuritySystem.pojo;

import java.io.Serializable;

public class Activityapply implements Serializable {

    private Integer no;


    private String activityname;


    private String activitystarttime;


    private String activityendtime;


    private String applicantname;


    private Integer rank;


    private String college;


    private String applicanttel;


    private String activitydescription;


    private String place;


    private String type;


    private static final long serialVersionUID = 1L;


    public Integer getNo() {
        return no;
    }


    public void setNo(Integer no) {
        this.no = no;
    }


    public String getActivityname() {
        return activityname;
    }


    public void setActivityname(String activityname) {
        this.activityname = activityname == null ? null : activityname.trim();
    }


    public String getActivitystarttime() {
        return activitystarttime;
    }


    public void setActivitystarttime(String activitystarttime) {
        this.activitystarttime = activitystarttime == null ? null : activitystarttime.trim();
    }


    public String getActivityendtime() {
        return activityendtime;
    }


    public void setActivityendtime(String activityendtime) {
        this.activityendtime = activityendtime == null ? null : activityendtime.trim();
    }


    public String getApplicantname() {
        return applicantname;
    }


    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname == null ? null : applicantname.trim();
    }


    public Integer getRank() {
        return rank;
    }


    public void setRank(Integer rank) {
        this.rank = rank;
    }


    public String getCollege() {
        return college;
    }


    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }


    public String getApplicanttel() {
        return applicanttel;
    }


    public void setApplicanttel(String applicanttel) {
        this.applicanttel = applicanttel == null ? null : applicanttel.trim();
    }


    public String getActivitydescription() {
        return activitydescription;
    }


    public void setActivitydescription(String activitydescription) {
        this.activitydescription = activitydescription == null ? null : activitydescription.trim();
    }


    public String getPlace() {
        return place;
    }


    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", no=").append(no);
        sb.append(", activityname=").append(activityname);
        sb.append(", activitystarttime=").append(activitystarttime);
        sb.append(", activityendtime=").append(activityendtime);
        sb.append(", applicantname=").append(applicantname);
        sb.append(", rank=").append(rank);
        sb.append(", college=").append(college);
        sb.append(", applicanttel=").append(applicanttel);
        sb.append(", activitydescription=").append(activitydescription);
        sb.append(", place=").append(place);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}