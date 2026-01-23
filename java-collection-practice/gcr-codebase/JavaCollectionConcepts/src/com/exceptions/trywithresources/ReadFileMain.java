package com.exceptions.trywithresources;

import java.io.IOException;

public class ReadFileMain {

    public static void main(String[] args) {

        try {
            String line = ReadFile.readFirstLine("info.txt");
            System.out.println(line);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
