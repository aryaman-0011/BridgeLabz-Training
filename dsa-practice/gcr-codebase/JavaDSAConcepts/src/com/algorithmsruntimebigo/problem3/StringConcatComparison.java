package com.algorithmsruntimebigo.problem3;

public class StringConcatComparison {

    // Using String
    public static long usingString(int n) {
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "a";   // creates new object every time (O(N²))
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    // Using StringBuilder
    public static long usingStringBuilder(int n) {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");   // mutable, fast (O(N))
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    // Using StringBuffer
    public static long usingStringBuffer(int n) {
        long start = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");   // synchronized, thread-safe (O(N))
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}
