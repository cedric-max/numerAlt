package com.numerlAlt.NumerAlt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "applicant_id")
    private Long applicantId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private String picture;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    private String address;

    @Column(name = "drivers_licence")
    private String driversLicence;

    @Column(name = "soft_skills")
    private String softSkills;

    @Column(name = "center_of_interest")
    private String centerOfInterest;

    @Column(name = "website")
    private String website;

    @Column(name = "github_link")
    private String githubLink;

    private String password;

    private String role;


}
