package com.algorithmsruntimebigo.problem5;

public class FibonacciComparisonMain {

    public static void main(String[] args) {

        int[] testCases = {10, 30, 50};

        for (int n : testCases) {
            System.out.println("\nFibonacci N = " + n);

            // Recursive
            if (n <= 30) { // avoid extreme delay
                long startRec = System.currentTimeMillis();
                int recResult = FibonacciComparison.fibonacciRecursive(n);
                long endRec = System.currentTimeMillis();

                System.out.println("Recursive Result: " + recResult);
                System.out.println("Recursive Time: " + (endRec - startRec) + " ms");
            } else {
                System.out.println("Recursive: Unfeasible (>1 hr)");
            }

            // Iterative
            long startItr = System.nanoTime();
            int itrResult = FibonacciComparison.fibonacciIterative(n);
            long endItr = System.nanoTime();

            System.out.println("Iterative Result: " + itrResult);
            System.out.println("Iterative Time: " + (endItr - startItr) / 1_000_000.0 + " ms");
        }
    }
}
