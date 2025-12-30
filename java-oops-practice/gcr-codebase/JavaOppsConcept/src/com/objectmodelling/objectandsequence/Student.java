package com.objectmodelling.objectandsequence;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Subject> subjects;

    Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    void addSubject(Subject subject) {
        subjects.add(subject);
    }

    List<Subject> getSubjects() {
        return subjects;
    }

    String getName() {
        return name;
    }
}
