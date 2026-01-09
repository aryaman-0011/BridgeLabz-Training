package com.algorithmsruntimebigo.problem4;

public class FileReadComparisonMain {

    public static void main(String[] args) throws Exception {

        // Change this path to your test file
        String filePath = "largefile.txt";  

        System.out.println("File Reading Performance Test\n");

        long timeFileReader =
                FileReadComparison.readUsingFileReader(filePath);
        System.out.println("FileReader Time: " + timeFileReader + " ms");

        long timeInputStreamReader =
                FileReadComparison.readUsingInputStreamReader(filePath);
        System.out.println("InputStreamReader Time: " + timeInputStreamReader + " ms");
    }
}
