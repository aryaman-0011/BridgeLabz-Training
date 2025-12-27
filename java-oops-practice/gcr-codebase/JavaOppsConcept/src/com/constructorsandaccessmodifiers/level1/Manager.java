package com.constructorsandaccessmodifiers.level1;

class Manager extends Employee {

    String designation;

    Manager(int employeeID, String department, double salary, String designation) {
        super(employeeID, department, salary);
        this.designation = designation;
    }

    void displayDetails() {
        System.out.println(
            "Employee ID: " + employeeID +     // public
            ", Department: " + department +    // protected
            ", Designation: " + designation +
            ", Salary: ₹" + getSalary()        // private via getter
        );
    }

    public static void main(String[] args) {

        Manager mgr = new Manager(
            101,
            "IT",
            75000.0,
            "Project Manager"
        );

        mgr.displayDetails();

        // Modify salary using public method
        mgr.updateSalary(82000.0);
        System.out.println("Updated Salary: ₹" + mgr.getSalary());
    }
}
