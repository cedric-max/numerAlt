package com.numerlAlt.NumerAlt.service;

import com.numerlAlt.NumerAlt.dto.UserDto;
import com.numerlAlt.NumerAlt.entity.Recruiter;
import com.numerlAlt.NumerAlt.repository.RecruiterRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RecruiterService implements RecruiterServiceInterface {

    @Autowired
    private RecruiterRepositoryInterface recruiterRepository;

    public Recruiter registerNewRecruiterAccount(UserDto recruiterDto) throws Exception {
        if(emailExist(recruiterDto.getEmail())) {
            throw new Exception("Il existe déjà un compte pour cette adresse email : " + recruiterDto.getEmail());
        }

        Recruiter recruiter = new Recruiter();
        recruiter.setFirstName(recruiterDto.getFirstName());
        recruiter.setLastName(recruiterDto.getLastName());
        recruiter.setPassword(recruiterDto.getPassword());
        recruiter.setEmail(recruiterDto.getEmail());
        //recruiter.setRole("ROLE_USER");

        return recruiterRepository.save(recruiter);
    }

    private Boolean emailExist(String email) {
        return recruiterRepository.findByEmail(email) != null;
    }
}
