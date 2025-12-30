package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    String getCourseName() {
        return courseName;
    }
}
