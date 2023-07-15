package com.doc.mediplus.repositories;

import com.doc.mediplus.models.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
}
