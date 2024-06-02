package com.blood.bank.repository;

import com.blood.bank.model.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<PatientModel,Long> {
    @Query("SELECT COALESCE(MAX(id), 0)+1 AS max_id FROM PatientModel")
    public Long getId();
    @Query("SELECT p FROM PatientModel p WHERE p.email=:email")
    public Optional<PatientModel> findByEmail(String email);
}
