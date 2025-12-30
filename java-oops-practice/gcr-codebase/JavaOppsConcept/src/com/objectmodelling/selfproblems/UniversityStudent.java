package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class UniversityStudent {
    private int studentId;
    private String name;
    private List<UniversityCourse> courses;

    UniversityStudent(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(UniversityCourse course) {
        courses.add(course);
        course.addStudent(this);   // association
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    String getName() {
        return name;
    }

    void showCourses() {
        System.out.println("Student: " + name);
        for (UniversityCourse c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

