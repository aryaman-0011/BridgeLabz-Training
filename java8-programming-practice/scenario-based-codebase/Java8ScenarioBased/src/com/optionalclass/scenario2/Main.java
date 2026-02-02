package com.optionalclass.scenario2;

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        Employee emp = service.findByEmail("rahul@company.com");

        // Fetch manager details
        System.out.println("Manager: " +
                emp.getManager()
                        .map(Employee::getFirstName)
                        .orElse("No Manager Assigned"));

        // Bonus or default 0
        System.out.println("Bonus: " +
                emp.getBonus().orElse(0.0));

        // Not found case (will throw exception)
        // service.findByEmail("xyz@company.com");

        // Insurance safely
        System.out.println("Insurance: " +
                emp.getInsurance().orElse("No Insurance"));

        // Middle name only if present
        emp.getMiddleName()
                .ifPresent(m -> System.out.println("Middle Name: " + m));
    }
}
