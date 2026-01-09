package com.algorithmsruntimebigo.problem3;

public class StringConcatComparisonMain {

    public static void main(String[] args) {

        int[] operations = {1000, 10000, 1000000};

        for (int n : operations) {
            System.out.println("\nOperations Count: " + n);

            // String
            if (n <= 10000) { // avoid extreme wait
                long timeString = StringConcatComparison.usingString(n);
                System.out.println("String: " + timeString + " ms");
            } else {
                System.out.println("String: Unusable (O(N²))");
            }

            // StringBuilder
            long timeBuilder = StringConcatComparison.usingStringBuilder(n);
            System.out.println("StringBuilder: " + timeBuilder + " ms");

            // StringBuffer
            long timeBuffer = StringConcatComparison.usingStringBuffer(n);
            System.out.println("StringBuffer: " + timeBuffer + " ms");
        }
    }
}
