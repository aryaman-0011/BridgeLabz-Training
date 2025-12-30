package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class Professor {
    private int professorId;
    private String name;
    private List<UniversityCourse> courses;

    Professor(int professorId, String name) {
        this.professorId = professorId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void assignCourse(UniversityCourse course) {
        courses.add(course);
        course.setProfessor(this);  // communication
        System.out.println("Prof. " + name + " assigned to " + course.getCourseName());
    }

    String getName() {
        return name;
    }

    void showCourses() {
        System.out.println("Professor: " + name);
        for (UniversityCourse c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
