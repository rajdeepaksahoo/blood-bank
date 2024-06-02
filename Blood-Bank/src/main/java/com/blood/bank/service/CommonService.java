package com.blood.bank.service;

import com.blood.bank.dto.DonorDto;
import com.blood.bank.dto.PatientDto;
import com.blood.bank.model.DonorModel;
import com.blood.bank.model.PatientModel;
import org.springframework.stereotype.Service;

@Service
public interface CommonService {
    public DonorModel mapToDonorModel(DonorDto donorDto);
    public DonorDto mapToDonorDto(DonorModel model);
    public PatientModel mapToPatientModel(PatientDto patientDto);
    public PatientDto mapToPatientDto(PatientModel model);
}
