package com.blood.bank.service.impl;

import com.blood.bank.repository.DonorRepository;
import com.blood.bank.dto.DonorDto;
import com.blood.bank.exception.DonorAlreadyExistsException;
import com.blood.bank.model.DonorModel;
import com.blood.bank.service.CommonService;
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
    private CommonService commonService;
    @Override
    @Transactional
    public DonorDto registerDonor(DonorDto donorDto) throws MessagingException {
        if(donorRepository.findByEmailId(donorDto.getEmail()).isPresent()){
            throw new DonorAlreadyExistsException();
        }

        DonorModel donorModel = donorRepository.save(commonService.mapToDonorModel(donorDto));
        mailService.sendMail(donorModel.getEmail(),"Registration As A Donor","You are successfully registered");
        return commonService.mapToDonorDto(donorModel);
    }


}
