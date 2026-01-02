package com.day_2.courseenrollment;

public class Enrollment implements Graded {

    private Student student;
    private Course course;
    private double grade;

    private static double totalGrades = 0;
    private static int courseCount = 0;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        courseCount++;
    }

    @Override
    public void assignGrade(double grade) {
        this.grade = grade;
        totalGrades += grade;
        student.calculateGpa(totalGrades, courseCount);
    }

    public void printTranscript() {
        System.out.println("Student: " + student.name);
        System.out.println("Level: " + student.getLevel());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Teacher: " + course.getCourseName());
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + student.getGpa());
    }
}
