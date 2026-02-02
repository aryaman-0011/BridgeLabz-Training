package com.optionalclass.scenario2;

import java.util.Optional;

public class Employee {

    private int id;
    private String firstName;
    private String middleName;
    private String email;
    private Employee manager;
    private Double bonus;
    private String insurance;

    public Employee(int id, String firstName, String middleName, String email,
                    Employee manager, Double bonus, String insurance) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.email = email;
        this.manager = manager;
        this.bonus = bonus;
        this.insurance = insurance;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getEmail() { return email; }

    public Optional<String> getMiddleName() {
        return Optional.ofNullable(middleName);
    }

    public Optional<Employee> getManager() {
        return Optional.ofNullable(manager);
    }

    public Optional<Double> getBonus() {
        return Optional.ofNullable(bonus);
    }

    public Optional<String> getInsurance() {
        return Optional.ofNullable(insurance);
    }

    @Override
    public String toString() {
        return firstName;
    }
}
