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

}

