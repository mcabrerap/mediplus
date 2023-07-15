package com.doc.mediplus.models;

import com.doc.mediplus.enums.Speciality;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("appointment")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Appointment{

    @Id
    private Long id;

    @NotNull
    private Long patientIdentification;

    @NotNull
    private Speciality speciality;

    @NotNull
    private Long doctorId;

    @NotNull
    private Long patientId;
}
