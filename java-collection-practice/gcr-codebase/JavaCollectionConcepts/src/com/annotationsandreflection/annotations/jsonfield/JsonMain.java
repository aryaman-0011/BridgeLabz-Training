package com.annotationsandreflection.annotations.jsonfield;

public class JsonMain {
    public static void main(String[] args) {

        User user = new User("Aryaman", 22, "secret123");

        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
