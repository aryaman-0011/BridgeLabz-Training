package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class UniversityManagement {
    private String universityName;
    private List<UniversityStudent> students;
    private List<Professor> professors;

    UniversityManagement(String universityName) {
        this.universityName = universityName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    void addStudent(UniversityStudent student) {
        students.add(student);
    }

    void addProfessor(Professor professor) {
        professors.add(professor);
    }

    void showUniversityDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Total Students: " + students.size());
        System.out.println("Total Professors: " + professors.size());
    }
}
