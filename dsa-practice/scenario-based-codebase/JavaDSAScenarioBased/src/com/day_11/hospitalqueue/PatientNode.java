package com.day_11.hospitalqueue;

public class PatientNode {
    Patient patient;
    int height;
    PatientNode left, right;

    public PatientNode(Patient p) {
        this.patient = p;
        this.height = 1;
    }
}
