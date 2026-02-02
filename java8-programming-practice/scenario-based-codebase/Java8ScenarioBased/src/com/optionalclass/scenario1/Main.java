package com.optionalclass.scenario1;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        // Fetch existing student
        Student student = service.findStudentById(1).get();

        // Safe email fetch
        System.out.println("Email: " +
                student.getEmail().orElse("Email not available"));

        // Default phone number if missing
        System.out.println("Phone: " +
                student.getPhone().orElse("0000000000"));

        // Student not found case
        System.out.println("Find ID 5: " +
                service.findStudentById(5)
                        .map(Student::getName)
                        .orElse("Student not available"));

        // Safe address fetch
        System.out.println("Address: " +
                student.getAddress().orElse("Address not provided"));

        // Nickname or real name
        System.out.println("Display Name: " +
                student.getNickname().orElse(student.getName()));
    }
}
