package com.numerlAlt.NumerAlt.service;

import com.numerlAlt.NumerAlt.entity.JobAdvert;

import java.util.List;
import java.util.Optional;


public interface JobAdvertServiceInterface {

    Optional<JobAdvert> findById(Long idJobAdvert);

    List<JobAdvert> findAll();
}
