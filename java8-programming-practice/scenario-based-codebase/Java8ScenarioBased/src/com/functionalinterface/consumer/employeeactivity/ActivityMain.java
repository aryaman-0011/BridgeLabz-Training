package com.functionalinterface.consumer.employeeactivity;

import java.time.LocalDateTime;
import java.util.function.Consumer;

public class ActivityMain {

    public static void main(String[] args) {

        Employee e1 = new Employee(201, "Aryaman");
        Employee e2 = new Employee(202, "Aryan");

        Consumer<Employee> logLogin = emp -> {
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Login Time: " + LocalDateTime.now());
            System.out.println("Status: LOGIN SUCCESS");
            System.out.println();
        };

        logLogin.accept(e1);
        logLogin.accept(e2);
    }
}
