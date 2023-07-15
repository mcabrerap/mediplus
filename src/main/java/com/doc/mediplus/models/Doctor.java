package com.doc.mediplus.models;

import com.doc.mediplus.enums.Speciality;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
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
@Table("doctor")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Doctor {

    @Id
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String lastname;

    @NotNull
    private Speciality speciality;

    @NotBlank
    private String medicalCenter;

    @NotBlank
    private String email;
}
