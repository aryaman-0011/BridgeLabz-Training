package com.streamapi.doctoravailabillity;

import java.util.*;

public class HospitalMain {

    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
            new Doctor("Dr. Mehta", "Cardiologist", true),
            new Doctor("Dr. Rao", "Neurologist", false),
            new Doctor("Dr. Singh", "Dermatologist", true),
            new Doctor("Dr. Patel", "Orthopedic", true),
            new Doctor("Dr. Sharma", "Pediatrician", false)
        );

        List<Doctor> weekendDoctors = doctors.stream()
                .filter(Doctor::isAvailableOnWeekend)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .toList();

        weekendDoctors.forEach(System.out::println);
    }
}