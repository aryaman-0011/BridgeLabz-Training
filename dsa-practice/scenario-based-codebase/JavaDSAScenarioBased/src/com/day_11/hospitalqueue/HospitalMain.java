package com.day_11.hospitalqueue;

public class HospitalMain {
    public static void main(String[] args) {

        HospitalAVL h = new HospitalAVL();

        h.register(new Patient(1, "Ravi", 900));
        h.register(new Patient(2, "Anita", 830));
        h.register(new Patient(3, "Karan", 945));
        h.register(new Patient(4, "Meera", 915));

        h.displayPatients();

        System.out.println("\n🚑 Discharging patient at 900\n");
        h.discharge(900);

        h.displayPatients();
    }
}
