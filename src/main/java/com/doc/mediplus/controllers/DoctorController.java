package com.doc.mediplus.controllers;

import com.doc.mediplus.models.Doctor;
import com.doc.mediplus.services.DoctorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody @Valid Doctor doctor) {
        return doctorService.save(doctor);
    }

    @GetMapping
    public Iterable<Doctor> getAllDoctors() {
        return doctorService.findAll();
    }
}
