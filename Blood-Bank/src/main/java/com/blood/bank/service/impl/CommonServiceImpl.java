package com.blood.bank.service.impl;

import com.blood.bank.dto.DonorDto;
import com.blood.bank.dto.PatientDto;
import com.blood.bank.model.DonorModel;
import com.blood.bank.model.PatientModel;
import com.blood.bank.service.CommonService;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {
    public DonorModel mapToDonorModel(DonorDto donorDto){
        return DonorModel.builder()
                .id(donorDto.getId())
                .address(donorDto.getAddress())
                .name(donorDto.getName())
                .email(donorDto.getEmail())
                .bloodType(donorDto.getBloodType())
                .contactNumber(donorDto.getContactNumber())
                .diseases(donorDto.getDiseases())
                .build();
    }

    public DonorDto mapToDonorDto(DonorModel model){
        return DonorDto.builder()
                .id(model.getId())
                .address(model.getAddress())
                .name(model.getName())
                .email(model.getEmail())
                .bloodType(model.getBloodType())
                .contactNumber(model.getContactNumber())
                .diseases(model.getDiseases())
                .build();
    }

    @Override
    public PatientModel mapToPatientModel(PatientDto patientDto) {
        return PatientModel.builder()
                .address(patientDto.getAddress())
                .id(patientDto.getId())
                .email(patientDto.getEmail())
                .medicalHistory(patientDto.getMedicalHistory())
                .bloodType(patientDto.getBloodType())
                .diseases(patientDto.getDiseases())
                .address(patientDto.getAddress())
                .build();
    }

    @Override
    public PatientDto mapToPatientDto(PatientModel model) {
        return PatientDto.builder()
                .address(model.getAddress())
                .id(model.getId())
                .email(model.getEmail())
                .medicalHistory(model.getMedicalHistory())
                .bloodType(model.getBloodType())
                .diseases(model.getDiseases())
                .address(model.getAddress())
                .build();
    }
}
