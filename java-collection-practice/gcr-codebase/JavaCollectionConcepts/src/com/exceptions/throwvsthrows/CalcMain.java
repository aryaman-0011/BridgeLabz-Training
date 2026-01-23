package com.exceptions.throwvsthrows;

public class CalcMain {

    public static void main(String[] args) {

        try {
            double interest = InterestCalculator.calculateInterest(-1, 5, 2);
            System.out.println("Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
