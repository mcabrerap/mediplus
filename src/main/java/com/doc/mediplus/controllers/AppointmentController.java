package com.doc.mediplus.controllers;

import com.doc.mediplus.models.Appointment;
import com.doc.mediplus.services.AppointmentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody @Valid Appointment appointment) {
        return appointmentService.save(appointment);
    }

    @GetMapping
    public Iterable<Appointment> getAllAppointments() {
        return appointmentService.findAll();
    }
}
