package com.doc.mediplus.controllers;

import com.doc.mediplus.models.Patient;
import com.doc.mediplus.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public Patient createPatient(@RequestBody @Valid Patient patient) {
        return patientService.save(patient);
    }

    @GetMapping
    public Iterable<Patient> getAllPatients() {
        return patientService.findAll();
    }
}
