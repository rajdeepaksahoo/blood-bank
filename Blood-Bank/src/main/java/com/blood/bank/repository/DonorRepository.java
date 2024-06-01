package com.blood.bank.repository;

import com.blood.bank.model.DonorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DonorRepository extends JpaRepository<DonorModel,Long> {
    @Query("SELECT d FROM DonorModel d WHERE d.email=:emailId")
    public Optional<DonorModel> findByEmailId(String emailId);
}
