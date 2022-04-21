package com.numerlAlt.NumerAlt.service;

import com.numerlAlt.NumerAlt.dto.UserDto;
import com.numerlAlt.NumerAlt.entity.Applicant;
import com.numerlAlt.NumerAlt.repository.ApplicantRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ApplicantService implements ApplicantServiceInterface{

    @Autowired
    private ApplicantRepositoryInterface applicantRepository;

    public Applicant registerNewApplicantAccount(UserDto applicantDto) throws Exception {
        if(emailExist(applicantDto.getEmail())) {
            throw new Exception("Il existe déjà un compte pour cette adresse email : " + applicantDto.getEmail());
        }

        Applicant applicant = new Applicant();
        applicant.setFirstName(applicantDto.getFirstName());
        applicant.setLastName(applicantDto.getLastName());
        applicant.setPassword(applicantDto.getPassword());
        applicant.setEmail(applicantDto.getEmail());
        //applicant.setRole("ROLE_USER");

        return applicantRepository.save(applicant);
    }

    private Boolean emailExist(String email) {
        return applicantRepository.findByEmail(email) != null;
    }
}
