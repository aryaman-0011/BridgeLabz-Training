package com.constructorsandaccessmodifiers.level1;

class Employee {

    // Access modifiers
    public int employeeID;        // accessible everywhere
    protected String department;  // accessible in subclass
    private double salary;        // accessible only within this class

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }
}
