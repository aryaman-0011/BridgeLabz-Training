package com.day_9.medwarehouse;

public class MedWareHouseMain {

    public static void main(String[] args) {

        Medicine[] medicines = {
            new Medicine("Paracetamol", "2026-03-15"),
            new Medicine("Cough Syrup", "2025-11-10"),
            new Medicine("Antibiotic", "2025-09-01"),
            new Medicine("Vitamin C", "2026-01-20"),
            new Medicine("Insulin", "2025-08-05")
        };

        System.out.println("Before Sorting:");
        printMedicines(medicines);

        MergeSorter.mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("\nAfter Sorting by Expiry:");
        printMedicines(medicines);

        System.out.println("\n⚠️ Medicines Near Expiry:");
        alertNearExpiry(medicines);
    }

    private static void printMedicines(Medicine[] medicines) {
        for (Medicine m : medicines) {
            System.out.println(m);
        }
    }

    private static void alertNearExpiry(Medicine[] medicines) {

        for (int i = 0; i < 2; i++) {
            System.out.println("ALERT → " + medicines[i]);
        }
    }
}
