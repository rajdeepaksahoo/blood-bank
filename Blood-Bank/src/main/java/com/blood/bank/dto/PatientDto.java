package com.blood.bank.dto;

import com.blood.bank.model.AddressModel;
import com.blood.bank.model.PatientDiseaseModel;
import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientDto {
    private Long id;
    private String name;
    private String contactNumber;
    private String email;
    private String bloodType;
    private String medicalHistory;
    private AddressModel address;
    private Set<PatientDiseaseModel> diseases;
}
