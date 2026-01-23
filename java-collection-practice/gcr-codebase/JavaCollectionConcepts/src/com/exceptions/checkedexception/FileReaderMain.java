package com.exceptions.checkedexception;

import java.io.IOException;

public class FileReaderMain {

    public static void main(String[] args) {

        try {
            ReadFile.readFile("data.txt");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}