package com.doc.mediplus.repositories;

import com.doc.mediplus.models.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
}
