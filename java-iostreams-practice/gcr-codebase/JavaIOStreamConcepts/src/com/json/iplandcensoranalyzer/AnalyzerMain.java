package com.json.iplandcensoranalyzer;

public class AnalyzerMain {
    public static void main(String[] args) throws Exception {
        JsonProcessor.process();
        CsvProcessor.process();
        System.out.println("Censorship completed");
    }
}
