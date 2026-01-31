package com.collectors.resultgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class ResultMain {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Aryaman", "Grade 10"),
                new Student("Riya", "Grade 9"),
                new Student("Kabir", "Grade 10"),
                new Student("Sneha", "Grade 8"),
                new Student("Vikram", "Grade 9")
        );

        Map<String, List<String>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.mapping(Student::getName, Collectors.toList())
                ));

        groupedStudents.forEach((grade, names) ->
                System.out.println(grade + " → " + names));
    }
}

