package com.exceptions.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = Calculator.divide(num1, num2);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid numeric values");
        }

        sc.close();
    }
}
