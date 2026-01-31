package com.streamapi.transformingnames;

import java.util.List;

public class TransFormMain {

    public static void main(String[] args) {

        List<String> customers = List.of(
                "aryaman",
                "riya",
                "kabir",
                "sneha",
                "vikram"
        );

        customers.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
