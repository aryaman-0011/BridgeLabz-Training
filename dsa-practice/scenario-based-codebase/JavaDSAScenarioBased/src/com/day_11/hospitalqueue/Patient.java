package com.day_11.hospitalqueue;

public class Patient {
    int id;
    String name;
    int checkInTime; 

    public Patient(int id, String name, int checkInTime) {
        this.id = id;
        this.name = name;
        this.checkInTime = checkInTime;
    }

    @Override
    public String toString() {
        return "Patient: " + name + " | ID: " + id + " | Time: " + checkInTime;
    }
}
