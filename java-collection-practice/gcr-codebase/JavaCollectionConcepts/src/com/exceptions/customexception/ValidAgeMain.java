package com.exceptions.customexception;

import java.util.Scanner;

public class ValidAgeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            ValidAge.validateAge(age);
            System.out.println("Access granted!");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

