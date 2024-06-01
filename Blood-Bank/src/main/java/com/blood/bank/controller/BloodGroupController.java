package com.blood.bank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bloodGroups")
public class BloodGroupController {
    @GetMapping
    public ResponseEntity<List<String>> listOfBloodGroups(){
        List<String> bloodGroups = new ArrayList<>();
        bloodGroups.add("A+");
        bloodGroups.add("A-");
        bloodGroups.add("B+");
        bloodGroups.add("B-");
        bloodGroups.add("AB+");
        bloodGroups.add("AB-");
        bloodGroups.add("O+");
        bloodGroups.add("O-");
        return new ResponseEntity<>(bloodGroups, HttpStatus.OK);
    }
}
