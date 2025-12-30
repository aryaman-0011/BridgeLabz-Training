package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class University {
    private String universityName;
    private List<Department> departments;
    private List<Faculty> faculties;

    University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: University creates Departments
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: Faculty passed from outside
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void showUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.displayDepartment();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
    }
}
