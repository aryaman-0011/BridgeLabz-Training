package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class UniversityCourse {
    private String courseName;
    private Professor professor;
    private List<UniversityStudent> students;

    UniversityCourse(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void addStudent(UniversityStudent student) {
        students.add(student);
    }

    void setProfessor(Professor professor) {
        this.professor = professor;
    }

    String getCourseName() {
        return courseName;
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (UniversityStudent s : students) {
            System.out.println("- " + s.getName());
        }
    }
}
