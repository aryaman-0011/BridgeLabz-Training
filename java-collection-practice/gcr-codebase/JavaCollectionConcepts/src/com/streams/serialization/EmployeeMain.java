package com.streams.serialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        String fileName = "src/com/streams/serialization/employees.dat";

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Aryaman", "IT", 60000));
        employees.add(new Employee(2, "Vishal", "HR", 45000));
        employees.add(new Employee(3, "Harsh", "Finance", 55000));

        try {
            SerializeEmployee.saveEmployees(employees, fileName);
            System.out.println("Employees saved successfully.");

            List<Employee> savedEmployees =
                    DeserializeEmployee.loadEmployees(fileName);

            System.out.println("Retrieved Employees:");
            for (Employee e : savedEmployees) {
                System.out.println(e);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during serialization process.");
        }
    }
}
