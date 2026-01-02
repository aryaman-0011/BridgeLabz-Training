package com.day_2.courseenrollment;

public class CourseMain {

    public static void main(String[] args) {

        Student s1 = new Undergraduate("U101", "Aryaman");
        Course c1 = new Course("CS101", "Data Structures");
        Faculty f1 = new Faculty("F01", "Dr. Vincent");

        Enrollment e1 = new Enrollment(s1, c1);

        f1.gradeStudent(e1, 8.5);
        e1.printTranscript();
    }
}
