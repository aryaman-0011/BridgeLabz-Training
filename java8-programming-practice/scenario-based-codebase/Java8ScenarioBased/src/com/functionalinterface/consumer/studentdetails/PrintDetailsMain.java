package com.functionalinterface.consumer.studentdetails;

import java.util.function.Consumer;

public class PrintDetailsMain {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Aryaman", 88.5);
        Student s2 = new Student(102, "Aryan", 91.2);

        Consumer<Student> printStudent = student -> {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Marks: " + student.getMarks());
            System.out.println();
        };

        // Using Consumer
        printStudent.accept(s1);
        printStudent.accept(s2);
    }
}
