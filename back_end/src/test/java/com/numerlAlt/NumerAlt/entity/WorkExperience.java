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
}
