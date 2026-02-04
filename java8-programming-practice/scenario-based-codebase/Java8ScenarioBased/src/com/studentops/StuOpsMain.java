package com.studentops;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StuOpsMain {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1,"Saurav",23,"Male","Mumbai","Mechanical",45,Arrays.asList("111","222")),
                new Student(2,"Priya",26,"Female","Delhi","Computer",12,Arrays.asList("333")),
                new Student(3,"Rohit",28,"Male","Karnataka","Electronics",78,Arrays.asList("444","555","666")),
                new Student(4,"Sneha",22,"Female","Mumbai","Biotech",5,Arrays.asList("777")),
                new Student(5,"Amit",30,"Male","Karnataka","Mechanical",60,Arrays.asList("888","999")),
                new Student(6,"Sara",24,"Female","Delhi","Computer",32,Arrays.asList("1010","2020"))
        );

        // ===== BASIC FILTERING =====
        students.stream().filter(s -> s.getRank() < 50).forEach(System.out::println);
        students.stream().filter(s -> s.getAge() > 25).forEach(System.out::println);
        students.stream().map(Student::getName).forEach(System.out::println);
        students.stream().filter(s -> s.getDepartment().equals("Mechanical")).forEach(System.out::println);
        students.stream().filter(s -> !s.getCity().equals("Mumbai")).forEach(System.out::println);

        // ===== SORTING =====
        students.stream().sorted(Comparator.comparing(Student::getRank)).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getRank)).limit(5).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getRank).reversed()).limit(3).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRank)).forEach(System.out::println);

        // ===== GROUPING & AGGREGATION =====
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting())));
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting())));
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::getAge))));
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getRank))));
        System.out.println("Total Students: " + students.size());

        students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::getRank)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);

        // ===== MIN / MAX =====
        students.stream().min(Comparator.comparing(Student::getRank)).ifPresent(System.out::println);
        students.stream().max(Comparator.comparing(Student::getRank)).ifPresent(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().ifPresent(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getRank)).skip(2).findFirst().ifPresent(System.out::println);
        students.stream().min(Comparator.comparing(Student::getAge)).ifPresent(System.out::println);
        students.stream().max(Comparator.comparing(Student::getAge)).ifPresent(System.out::println);

        // ===== FLATMAP =====
        students.stream().flatMap(s -> s.getContacts().stream()).forEach(System.out::println);
        System.out.println("Total Contacts: " + students.stream().flatMap(s -> s.getContacts().stream()).count());
        students.stream().filter(s -> s.getContacts().size() > 1).forEach(System.out::println);
        students.stream().flatMap(s -> s.getContacts().stream()).distinct().forEach(System.out::println);

        // ===== MATCHING =====
        System.out.println(students.stream().anyMatch(s -> s.getDepartment().equals("Biotech")));
        System.out.println(students.stream().allMatch(s -> s.getAge() > 20));
        System.out.println(students.stream().noneMatch(s -> s.getDepartment().equals("Civil")));

        // ===== GENDER ANALYSIS =====
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting())));
        System.out.println(students.stream().filter(s -> s.getGender().equals("Male")).collect(Collectors.averagingInt(Student::getAge)));
        System.out.println(students.stream().filter(s -> s.getGender().equals("Female")).collect(Collectors.averagingInt(Student::getAge)));
        students.stream().filter(s -> s.getGender().equals("Male")).min(Comparator.comparing(Student::getRank)).ifPresent(System.out::println);
        students.stream().filter(s -> s.getGender().equals("Female")).min(Comparator.comparing(Student::getRank)).ifPresent(System.out::println);

        // ===== DEPARTMENT SPECIFIC =====
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.mapping(Student::getName, Collectors.toList()))));
        students.stream().filter(s -> s.getDepartment().equals("Computer")).min(Comparator.comparing(Student::getAge)).ifPresent(System.out::println);
        students.stream().filter(s -> s.getDepartment().equals("Mechanical")).min(Comparator.comparing(Student::getRank)).ifPresent(System.out::println);
        System.out.println(students.stream().filter(s -> s.getDepartment().equals("Electronics") && s.getCity().equals("Karnataka")).count());

        // ===== ADVANCED =====
        System.out.println(students.stream().collect(Collectors.toMap(Student::getId, Student::getName)));
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDepartment)));
        students.stream().filter(s -> s.getName().startsWith("S")).forEach(System.out::println);
        students.stream().filter(s -> s.getName().length() > 5).forEach(System.out::println);
        students.stream().filter(s -> s.getRank() % 2 == 0).forEach(System.out::println);
        students.stream().filter(s -> s.getRank() % 2 != 0).forEach(System.out::println);

        // ===== BONUS =====
        students.stream().sorted(Comparator.comparing(Student::getAge)).limit(3).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).limit(3).forEach(System.out::println);
        System.out.println(students.stream().collect(Collectors.partitioningBy(s -> s.getAge() > 25)));
        System.out.println(students.stream().collect(Collectors.partitioningBy(s -> s.getRank() < 100)));
        students.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);
        students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
                .entrySet().stream().min(Map.Entry.comparingByValue()).ifPresent(System.out::println);
    }
}