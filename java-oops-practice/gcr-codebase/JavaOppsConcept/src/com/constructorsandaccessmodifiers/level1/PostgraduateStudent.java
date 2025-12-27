package com.constructorsandaccessmodifiers.level1;

class PostgraduateStudent extends Student {

    String specialization;

    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println(
            "Roll Number: " + rollNumber +
            ", Name: " + name +
            ", Specialization: " + specialization +
            ", CGPA: " + getCGPA()
        );
    }

    public static void main(String[] args) {
        PostgraduateStudent pg =
            new PostgraduateStudent(101, "Aryaman", 8.4, "Computer Science");

        pg.displayDetails();
    }
}
