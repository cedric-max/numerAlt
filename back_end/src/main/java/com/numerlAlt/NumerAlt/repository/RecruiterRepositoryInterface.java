package com.numerlAlt.NumerAlt.repository;

import com.numerlAlt.NumerAlt.entity.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterRepositoryInterface extends JpaRepository<Recruiter, Long> {
    Recruiter findByEmail(String email);
}
