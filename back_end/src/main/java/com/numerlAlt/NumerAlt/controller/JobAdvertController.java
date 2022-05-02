package com.numerlAlt.NumerAlt.controller;

import com.numerlAlt.NumerAlt.entity.JobAdvert;
import com.numerlAlt.NumerAlt.service.JobAdvertServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value="/job_advert")
@CrossOrigin
public class JobAdvertController {

    @Autowired
    private JobAdvertServiceInterface JobAdvertService;

    //  Permet de récupérer une offre avec son iD
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{job_advert_id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public JobAdvert getJobAdvertById(@PathVariable Long job_advert_id) {
        return JobAdvertService.findById(job_advert_id).get();
    }

    //  Permet de récupérer l'intégralité des offres
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<JobAdvert> findAll() {
        return JobAdvertService.findAll();
    }

}
