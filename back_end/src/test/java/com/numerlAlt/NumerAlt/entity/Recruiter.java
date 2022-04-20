package com.numerlAlt.NumerAlt.entity;

import javax.persistence.*;

@Entity
@Table(name = "recruiter")
public class Recruiter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recruiter_id")
    private Long recruiterId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private String picture;

    @Column(name = "company_name")
    private String companyName;

    private String password;

    private String role;
}
