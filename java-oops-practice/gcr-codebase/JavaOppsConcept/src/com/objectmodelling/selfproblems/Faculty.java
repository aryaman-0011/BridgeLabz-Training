package com.objectmodelling.selfproblems;

class Faculty {
    private int facultyId;
    private String name;

    Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    void displayFaculty() {
        System.out.println("Faculty ID: " + facultyId + ", Name: " + name);
    }
}
