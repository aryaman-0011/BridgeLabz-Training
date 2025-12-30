package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private int patientId;
    private String name;
    private List<Doctor> doctors;

    Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    String getName() {
        return name;
    }

    void showDoctors() {
        System.out.println("Patient " + name + " consulted:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}
