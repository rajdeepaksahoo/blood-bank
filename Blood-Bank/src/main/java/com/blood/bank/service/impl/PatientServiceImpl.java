package com.blood.bank.service.impl;

import com.blood.bank.dto.DonorDto;
import com.blood.bank.dto.PatientDto;
import com.blood.bank.model.DonorModel;
import com.blood.bank.repository.DonorRepository;
import com.blood.bank.repository.PatientRepository;
import com.blood.bank.service.CommonService;
import com.blood.bank.service.PatientService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {
    private DonorRepository donorRepository;
    private PatientRepository patientRepository;
    private CommonService commonService;

    @Override
    public List<DonorDto> getDonorByBloodGroup(PatientDto patientDto) {

        // Save Patient Details If Data Not Available

        if (patientRepository.findByEmail(patientDto.getEmail()).isEmpty())
            patientRepository.save(commonService.mapToPatientModel(patientDto));
        return donorRepository.findByBloodType(patientDto.getBloodType()).stream().map(commonService::mapToDonorDto).toList();
    }
}
