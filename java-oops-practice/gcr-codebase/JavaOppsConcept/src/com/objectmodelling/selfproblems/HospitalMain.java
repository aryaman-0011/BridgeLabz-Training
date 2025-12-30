package com.objectmodelling.selfproblems;

public class HospitalMain{
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor(1, "Verma");
        Doctor d2 = new Doctor(2, "Singh");

        Patient p1 = new Patient(101, "Pratham");
        Patient p2 = new Patient(102, "Riya");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();
        d1.showPatients();
        System.out.println();
        p1.showDoctors();
    }
}
