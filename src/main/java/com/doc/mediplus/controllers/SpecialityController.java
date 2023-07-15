package com.doc.mediplus.controllers;

import com.doc.mediplus.enums.Speciality;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/specialities")
public class SpecialityController {

    @GetMapping
    public Speciality[] getSpecialities() {
        return Speciality.values();
    }
}
