package com.objectmodelling.objectandsequence;

public class SchoolResult{
    public static void main(String[] args) {

        // Object Diagram representation
        Student student = new Student("John");

        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        student.addSubject(maths);
        student.addSubject(science);

        // Sequence Diagram flow
        GradeCalculator calculator = new GradeCalculator();
        char grade = calculator.calculateGrade(student);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Final Grade: " + grade);
    }
}
