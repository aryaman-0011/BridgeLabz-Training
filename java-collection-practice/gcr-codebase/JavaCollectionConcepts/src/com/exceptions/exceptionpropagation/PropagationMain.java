package com.exceptions.exceptionpropagation;

public class PropagationMain {

    public static void main(String[] args) {

        try {
            Operation.method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
