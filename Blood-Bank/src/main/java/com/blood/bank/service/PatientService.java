package com.blood.bank.service;

import com.blood.bank.dto.DonorDto;
import com.blood.bank.dto.PatientDto;

import java.util.List;

public interface PatientService {
    public List<DonorDto> getDonorByBloodGroup(PatientDto patientDto);
}
