package com.blood.bank.controller;

import com.blood.bank.dto.BloodDonateResponse;
import com.blood.bank.dto.DonorDto;
import com.blood.bank.dto.PatientDto;
import com.blood.bank.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
@AllArgsConstructor
public class PatientController {
    private PatientService patientService;
    @PostMapping(value = "/request" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BloodDonateResponse<?,?,?>> getDonorsByBloodGroup(@RequestBody PatientDto patientDto){
        List<DonorDto> donorByBloodGroup = patientService.getDonorByBloodGroup(patientDto);
        return new ResponseEntity<>(BloodDonateResponse.builder()
                .message("Success")
                .data(donorByBloodGroup)
                .requestStatus(true)
                .build(), HttpStatus.OK);
    }
}
