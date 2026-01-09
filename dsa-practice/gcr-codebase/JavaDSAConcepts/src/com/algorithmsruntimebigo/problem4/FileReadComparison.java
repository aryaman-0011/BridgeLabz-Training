package com.algorithmsruntimebigo.problem4;

import java.io.*;

public class FileReadComparison {

    // FileReader
    public static long readUsingFileReader(String filePath) throws IOException {
        long start = System.currentTimeMillis();

        FileReader reader = new FileReader(filePath);
        while (reader.read() != -1) {
            // reading character by character
        }
        reader.close();

        long end = System.currentTimeMillis();
        return end - start;
    }

    // InputStreamReader
    public static long readUsingInputStreamReader(String filePath) throws IOException {
        long start = System.currentTimeMillis();

        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(filePath));

        while (reader.read() != -1) {
            // reading bytes and converting to characters
        }
        reader.close();

        long end = System.currentTimeMillis();
        return end - start;
    }
}
