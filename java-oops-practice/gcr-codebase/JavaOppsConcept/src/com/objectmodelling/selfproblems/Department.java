package com.objectmodelling.selfproblems;

class Department {
    private String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
    }
}
