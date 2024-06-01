package com.blood.bank.service.impl;

import com.blood.bank.repository.DonorRepository;
import com.blood.bank.dto.DonorDto;
import com.blood.bank.exception.DonorAlreadyExistsException;
import com.blood.bank.model.DonorModel;
import com.blood.bank.service.DonorService;
import com.blood.bank.service.MailService;
import jakarta.mail.MessagingException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DonorServiceImpl implements DonorService {
    private MailService mailService;
    private DonorRepository donorRepository;
    @Override
    @Transactional
    public DonorDto registerDonor(DonorDto donorDto) throws MessagingException {
        if(donorRepository.findByEmailId(donorDto.getEmail()).isPresent()){
            throw new DonorAlreadyExistsException();
        }

        DonorModel donorModel = donorRepository.save(mapToDonorModel(donorDto));
        mailService.sendMail(donorModel.getEmail(),"Registration As A Donor","You are successfully registered");
        return mapToDonorDto(donorModel);
    }

    private DonorModel mapToDonorModel(DonorDto donorDto){
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

    private DonorDto mapToDonorDto(DonorModel model){
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
}
