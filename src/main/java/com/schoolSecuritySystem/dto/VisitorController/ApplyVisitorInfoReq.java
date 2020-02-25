package com.schoolSecuritySystem.dto.VisitorController;

import java.util.Date;

public class ApplyVisitorInfoReq {
    private String visitorName;
    private String visitorTel;
    private Date startDate;
    private Date startTime;
    private String applicantName;
    private String applicanttel;
    private String applicantEmail;
    private String type;

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitorTel() {
        return visitorTel;
    }

    public void setVisitorTel(String visitorTel) {
        this.visitorTel = visitorTel;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicanttel() {
        return applicanttel;
    }

    public void setApplicanttel(String applicanttel) {
        this.applicanttel = applicanttel;
    }

    public String getApplicantEmail() {
        return applicantEmail;
    }

    public void setApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
