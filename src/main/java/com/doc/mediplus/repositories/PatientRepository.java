package com.doc.mediplus.repositories;

import com.doc.mediplus.models.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
