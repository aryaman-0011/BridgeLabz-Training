package com.exceptions.exceptionpropagation;

public class Operation {

    public static void method1() {
        int x = 10 / 0;
    }

    public static void method2() {
        method1();     
    }
}