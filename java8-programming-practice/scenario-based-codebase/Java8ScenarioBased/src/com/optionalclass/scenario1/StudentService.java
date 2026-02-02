package com.optionalclass.scenario1;

import java.util.*;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Aryan", "aryan@mail.com", null, "Delhi", "Aru"));
        students.add(new Student(2, "Rahul", null, "9876543210", null, null));
    }

    // 3. Find student by ID
    public Optional<Student> findStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();
    }
}
