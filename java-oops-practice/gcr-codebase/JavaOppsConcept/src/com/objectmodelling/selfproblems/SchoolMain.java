package com.objectmodelling.selfproblems;

public class SchoolMain {
    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student(1, "Pratham");
        Student s2 = new Student(2, "Riya");

        Course java = new Course("Java");
        Course python = new Course("Python");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(java);
        s1.enrollCourse(python);
        s2.enrollCourse(java);

        s1.showCourses();
        System.out.println();
        java.showStudents();
        System.out.println();
        school.showStudents();
    }
}
