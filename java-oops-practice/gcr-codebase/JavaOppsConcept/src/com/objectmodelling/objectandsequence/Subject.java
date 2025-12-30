package com.objectmodelling.objectandsequence;

class Subject {
    private String subjectName;
    private int marks;

    Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    String getSubjectName() {
        return subjectName;
    }
}
