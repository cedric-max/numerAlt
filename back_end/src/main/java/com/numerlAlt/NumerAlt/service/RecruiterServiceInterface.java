package com.numerlAlt.NumerAlt.service;

import com.numerlAlt.NumerAlt.dto.UserDto;
import com.numerlAlt.NumerAlt.entity.Recruiter;

public interface RecruiterServiceInterface {

    Recruiter registerNewRecruiterAccount(UserDto userDto) throws Exception;
}
