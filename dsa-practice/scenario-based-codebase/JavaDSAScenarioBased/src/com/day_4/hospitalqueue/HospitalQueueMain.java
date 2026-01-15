/*
1. HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
memory.
Key Concepts:
● Bubble Sort for small datasets
● In-place comparison
● Swapping adjacent patient records
*/


package com.day_4.hospitalqueue;


public class HospitalQueueMain {

    // Bubble Sort by criticality (high → low)
    public static void bubbleSortByCriticality(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (patients[j].criticality < patients[j + 1].criticality) {
                    // Swap adjacent patients
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    // Display patient list
    public static void displayPatients(Patient[] patients) {
        for (Patient p : patients) {
            System.out.println(p.name + " | Criticality: " + p.criticality);
        }
    }

    public static void main(String[] args) {

        Patient[] patients = {
            new Patient("Ramesh", 3),
            new Patient("Sita", 8),
            new Patient("Aman", 5),
            new Patient("Neha", 9),
            new Patient("Kunal", 2)
        };

        System.out.println("Before Sorting (Arrival Order):");
        displayPatients(patients);

        bubbleSortByCriticality(patients);

        System.out.println("\nAfter Sorting (By Criticality):");
        displayPatients(patients);
    }
}
