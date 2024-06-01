package com.blood.bank.service;

import com.blood.bank.dto.DonorDto;
import com.blood.bank.model.DonorModel;
import jakarta.mail.MessagingException;

public interface DonorService {
    public DonorDto registerDonor(DonorDto donorDto) throws MessagingException;
}
