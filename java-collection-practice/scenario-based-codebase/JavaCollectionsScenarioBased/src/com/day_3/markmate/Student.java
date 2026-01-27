package com.day_3.markmate;

public class Student {
    String name;
    int maths;
    int science;
    int english;
    int computer;
    int total;
    double average;
    String grade;

    public Student(String name, int maths, int science, int english, int computer) {
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;
        this.computer = computer;
    }
}
