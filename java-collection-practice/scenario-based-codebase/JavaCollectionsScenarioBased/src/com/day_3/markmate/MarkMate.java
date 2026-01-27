package com.day_3.markmate;

import java.io.*;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MarkMate {

    public static void processCSV(String inputFile, String outputFile) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                try {
                    String name = data[0];
                    int maths = Integer.parseInt(data[1]);
                    int science = Integer.parseInt(data[2]);
                    int english = Integer.parseInt(data[3]);
                    int computer = Integer.parseInt(data[4]);

                    Student s = new Student(name, maths, science, english, computer);

                    // Calculations
                    s.total = maths + science + english + computer;
                    s.average = s.total / 4.0;
                    s.grade = calculateGrade(s.average);

                    students.add(s);

                } catch (NumberFormatException e) {
                    System.out.println("Invalid marks found for student: " + data[0] + ". Skipping entry.");
                }
            }

            // Convert to JSON
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(outputFile);
            gson.toJson(students, writer);
            writer.close();

            System.out.println("JSON report generated successfully!");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static String calculateGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "Fail";
    }
}
