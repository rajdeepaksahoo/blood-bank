package com.blood.bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DonorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String bloodType;
    private String contactNumber;
    private String email;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private AddressModel address;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "donor_disease",
            joinColumns = { @JoinColumn(name = "donor_id") },
            inverseJoinColumns = { @JoinColumn(name = "disease_id") }
    )
    private Set<DonorDiseaseModel> diseases;
}
