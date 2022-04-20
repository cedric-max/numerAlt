package com.numerlAlt.NumerAlt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "training")
public class Training {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    @Column(name = "training_id")
    private Long trainingId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "training_name")
    private String trainingName;

    @Column(name = "training_description")
    private String trainingDescription;

    private String school;
}
