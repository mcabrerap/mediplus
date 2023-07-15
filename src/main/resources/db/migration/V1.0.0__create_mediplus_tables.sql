CREATE TABLE doctor
(
    id             BIGINT PRIMARY KEY AUTO_INCREMENT,
    name           VARCHAR(255),
    lastname       VARCHAR(255),
    speciality     VARCHAR(255),
    medical_center VARCHAR(255),
    email          VARCHAR(255) UNIQUE
);

CREATE TABLE patient
(
    id             BIGINT PRIMARY KEY AUTO_INCREMENT,
    name           VARCHAR(255),
    lastname       VARCHAR(255),
    identification BIGINT UNIQUE,
    age            INTEGER,
    phone          VARCHAR(255)
);

CREATE TABLE appointment
(
    id                     BIGINT PRIMARY KEY AUTO_INCREMENT,
    patient_identification BIGINT,
    speciality             VARCHAR(255),
    doctor_id              BIGINT,
    patient_id             BIGINT,
    FOREIGN KEY (doctor_id) REFERENCES doctor (id),
    FOREIGN KEY (patient_id) REFERENCES patient (id)
);
