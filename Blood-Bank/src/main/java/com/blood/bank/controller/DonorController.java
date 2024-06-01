package com.blood.bank.controller;

import com.blood.bank.dto.DonorDto;
import com.blood.bank.service.DonorService;
import jakarta.mail.MessagingException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/donor")
public class DonorController {
    private DonorService donorService;

    @PostMapping("/register")
    public ResponseEntity<DonorDto> registerDonor(@RequestBody DonorDto donorDto) throws MessagingException {
        return new ResponseEntity<>(donorService.registerDonor(donorDto), HttpStatus.OK);
    }
}
