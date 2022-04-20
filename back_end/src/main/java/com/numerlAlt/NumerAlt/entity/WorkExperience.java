package com.numerlAlt.NumerAlt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "workExperience")
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_experience_id")
    private Long workExperienceId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    private String company;

    @Column(name = "experience_name")
    private String experienceName;

    @Column(name = "experience_description")
    private String experienceDescription;

    private String business;

    public Long getWorkExperienceId() {
        return workExperienceId;
    }

    public void setWorkExperienceId(Long workExperienceId) {
        this.workExperienceId = workExperienceId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getExperienceName() {
        return experienceName;
    }

    public void setExperienceName(String experienceName) {
        this.experienceName = experienceName;
    }

    public String getExperienceDescription() {
        return experienceDescription;
    }

    public void setExperienceDescription(String experienceDescription) {
        this.experienceDescription = experienceDescription;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }
}
