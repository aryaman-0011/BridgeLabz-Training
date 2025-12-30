package com.objectmodelling.selfproblems;

public class UniversityMain {
    public static void main(String[] args) {

        Faculty f1 = new Faculty(1, "Dr. Sharma");
        Faculty f2 = new Faculty(2, "Dr. Mehta");

        University uni = new University("Tech University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversityDetails();

        // Deleting University
        uni = null;

        // Faculty still exists
        f1.displayFaculty();
        f2.displayFaculty();
    }
}
