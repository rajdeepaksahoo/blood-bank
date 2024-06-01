package com.blood.bank.dto;

import com.blood.bank.model.AddressModel;
import com.blood.bank.model.DonorDiseaseModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DonorDto {
    private Long id;
    private String name;
    private String bloodType;
    private String contactNumber;
    private String email;
    private AddressModel address;
    private Set<DonorDiseaseModel> diseases;
}
