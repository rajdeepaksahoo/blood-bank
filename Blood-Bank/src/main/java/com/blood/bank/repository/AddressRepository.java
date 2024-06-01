package com.blood.bank.repository;

import com.blood.bank.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepository extends JpaRepository<AddressModel,Long> {
    @Query("SELECT COALESCE(MAX(id), 0)+1 AS max_id FROM AddressModel")
    public Long getId();
}
