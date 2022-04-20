package com.numerlAlt.NumerAlt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "jobAdvert")
public class JobAdvert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_advert_id")
    private Long jobAdvertId;

    private String reference;

    private String title;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "expiry_date")
    private Date expiryDate;

    private String description;

    private String city;

    @Column(name = "target_level")
    private String targetLevel;

    private String logo;

    @Column(name = "desired_profil")
    private String desiredProfil;

    @Column(name = "minimum_profil")
    private String minimumProfil;

    @Column(name = "necessary_knowledge")
    private String necessaryKnowledge;

    @Column(name = "necessary_tools")
    private String necessaryTools;

    @Column(name = "indicative_salary")
    private Integer indicativeSalary;

    public Long getJobAdvertId() {
        return jobAdvertId;
    }

    public void setJobAdvertId(Long jobAdvertId) {
        this.jobAdvertId = jobAdvertId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTargetLevel() {
        return targetLevel;
    }

    public void setTargetLevel(String targetLevel) {
        this.targetLevel = targetLevel;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDesiredProfil() {
        return desiredProfil;
    }

    public void setDesiredProfil(String desiredProfil) {
        this.desiredProfil = desiredProfil;
    }

    public String getMinimumProfil() {
        return minimumProfil;
    }

    public void setMinimumProfil(String minimumProfil) {
        this.minimumProfil = minimumProfil;
    }

    public String getNecessaryKnowledge() {
        return necessaryKnowledge;
    }

    public void setNecessaryKnowledge(String necessaryKnowledge) {
        this.necessaryKnowledge = necessaryKnowledge;
    }

    public String getNecessaryTools() {
        return necessaryTools;
    }

    public void setNecessaryTools(String necessaryTools) {
        this.necessaryTools = necessaryTools;
    }

    public Integer getIndicativeSalary() {
        return indicativeSalary;
    }

    public void setIndicativeSalary(Integer indicativeSalary) {
        this.indicativeSalary = indicativeSalary;
    }
}

