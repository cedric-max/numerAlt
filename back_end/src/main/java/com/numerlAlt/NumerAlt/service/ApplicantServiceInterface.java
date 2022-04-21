package com.numerlAlt.NumerAlt.service;

import com.numerlAlt.NumerAlt.dto.UserDto;
import com.numerlAlt.NumerAlt.entity.Applicant;

public interface ApplicantServiceInterface {

    Applicant registerNewApplicantAccount(UserDto userDto) throws Exception;
}
