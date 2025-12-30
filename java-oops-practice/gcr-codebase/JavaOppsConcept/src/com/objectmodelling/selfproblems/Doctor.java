package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private int doctorId;
    private String name;
    private List<Patient> patients;

    Doctor(int doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
        this.patients = new ArrayList<>();
    }

    void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this); // bidirectional association

        System.out.println(
            "Dr. " + name + " is consulting patient " + patient.getName()
        );
    }

    String getName() {
        return name;
    }

    void showPatients() {
        System.out.println("Dr. " + name + " consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
