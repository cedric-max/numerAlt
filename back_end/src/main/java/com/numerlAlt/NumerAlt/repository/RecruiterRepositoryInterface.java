package com.numerlAlt.NumerAlt.repository;

import com.numerlAlt.NumerAlt.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepositoryInterface extends JpaRepository<Applicant, Long> {
    Applicant findByEmail(String email);
}
