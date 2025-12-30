package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors Available: " + doctors.size());
        System.out.println("Patients Registered: " + patients.size());
    }
}
