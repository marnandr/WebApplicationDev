package hu.iit.uni.miskolc.webapp.dev.core.model;

import java.util.Date;

public class Applicant {

    private int id;
    private String name;
    private String phoneNumber;
    private Job appliedJob;
    private Date applicationDate;

    public Applicant() {
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Job getAppliedJob() {
        return appliedJob;
    }

    public void setAppliedJob(Job appliedJob) {
        this.appliedJob = appliedJob;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }
}
