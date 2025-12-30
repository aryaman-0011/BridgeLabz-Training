package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int rollNo;
    private String name;
    private List<Course> courses;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // bidirectional association
    }

    void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    String getName() {
        return name;
    }
}
