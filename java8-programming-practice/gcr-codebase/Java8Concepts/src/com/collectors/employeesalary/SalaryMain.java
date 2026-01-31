package com.collectors.employeesalary;


import java.util.*;
import java.util.stream.Collectors;

public class SalaryMain {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Aryaman", "IT", 60000),
                new Employee("Riya", "HR", 45000),
                new Employee("Kabir", "IT", 75000),
                new Employee("Sneha", "Finance", 80000),
                new Employee("Vikram", "HR", 50000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " → Avg Salary: ₹" + avgSalary));
    }
}
