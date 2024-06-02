package com.blood.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BloodDonateResponse <A,B,C>{
    private A message;
    private B data;
    private C requestStatus;
}
