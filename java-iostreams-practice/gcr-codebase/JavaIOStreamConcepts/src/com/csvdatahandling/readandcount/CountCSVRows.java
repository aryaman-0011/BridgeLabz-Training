package com.csvdatahandling.readandcount;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountCSVRows {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("D:\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\readandcount\\employees.csv"));
        int count = 0;

        br.readLine(); // skip header

        while (br.readLine() != null) {
            count++;
        }

        br.close();

        System.out.println("Number of records: " + count);
    }
}
