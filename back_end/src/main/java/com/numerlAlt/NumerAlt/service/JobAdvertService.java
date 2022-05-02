package com.numerlAlt.NumerAlt.service;

import com.numerlAlt.NumerAlt.entity.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.numerlAlt.NumerAlt.repository.JobAdvertRepositoryInterface;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class JobAdvertService implements JobAdvertServiceInterface {

    @Autowired
    private JobAdvertRepositoryInterface jobAdvertRepository;

    @Override
    public Optional<JobAdvert> findById(Long idJobAdvert) {
        Optional<JobAdvert> jobAdvert = jobAdvertRepository.findById(idJobAdvert);
        if (jobAdvert.isEmpty()) {
            throw new EntityNotFoundException("L'offre d'emploie avec l'identifiant " + idJobAdvert + " n'existe pas !");
        }
        return jobAdvert;
    }

    @Override
    public List<JobAdvert> findAll() {
        List<JobAdvert> jobAdvertResponse = jobAdvertRepository.findAll();
        if (jobAdvertResponse.isEmpty()) {
            throw new EntityNotFoundException("Il n'y a pas d'offres en BDD !");
        }
        return jobAdvertResponse;
    }
}

