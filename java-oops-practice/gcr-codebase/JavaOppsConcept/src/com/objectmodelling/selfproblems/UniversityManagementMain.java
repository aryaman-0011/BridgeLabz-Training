package com.objectmodelling.selfproblems;

public class UniversityManagementMain {
    public static void main(String[] args) {

    	UniversityManagement uni = new UniversityManagement("Tech University");

        UniversityStudent s1 = new UniversityStudent(1, "Pratham");
        UniversityStudent s2 = new UniversityStudent(2, "Riya");

        Professor p1 = new Professor(101, "Dr. Sharma");

        UniversityCourse java = new UniversityCourse("Java Programming");
        UniversityCourse ai = new UniversityCourse("Artificial Intelligence");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);

        s1.enrollCourse(java);
        s2.enrollCourse(java);
        s1.enrollCourse(ai);

        p1.assignCourse(java);
        p1.assignCourse(ai);

        System.out.println();
        java.showCourseDetails();
    }
}
