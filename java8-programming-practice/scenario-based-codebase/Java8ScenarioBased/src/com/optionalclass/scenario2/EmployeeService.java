package com.optionalclass.scenario2;

import java.util.*;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {

        Employee manager = new Employee(1, "Aryan", null,
                "aryan@company.com", null, 5000.0, "Health Plus");

        Employee emp = new Employee(2, "Rahul", "Kumar",
                "rahul@company.com", manager, null, null);

        employees.add(manager);
        employees.add(emp);
    }

    // 3. Find employee by email
    public Employee findByEmail(String email) {
        return employees.stream()
                .filter(e -> e.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));
    }
}
