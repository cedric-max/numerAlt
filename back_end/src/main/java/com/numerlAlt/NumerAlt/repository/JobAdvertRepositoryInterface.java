package com.numerlAlt.NumerAlt.repository;

import com.numerlAlt.NumerAlt.entity.JobAdvert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertRepositoryInterface extends JpaRepository<JobAdvert, Long> {

    @Override
    List<JobAdvert> findAll();
}