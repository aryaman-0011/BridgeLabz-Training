package com.streamonly;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class SolvedByStreamOnlyMain {

    public static void main(String[] args) {

        // Character Frequency Count
        String s1 = "banana";
        Map<Character, Long> freq1 = s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("1. " + freq1);

        // Word Frequency Count
        String s2 = "java is java and java is fast";
        Map<String, Long> freq2 = Arrays.stream(s2.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("2. " + freq2);

        // First Non-Repeating Character
        String s3 = "stress";
        Character firstUnique = s3.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("3. " + firstUnique);

        // All Non-Repeating Characters
        String s4 = "programming";
        List<Character> uniqueChars = s4.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("4. " + uniqueChars);

        // Remove Duplicate Characters
        String s5 = "banana";
        String noDup = s5.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("5. " + noDup);

        // Remove Repeating Characters (Keep Only Unique Once)
        String s6 = "aabbccdde";
        String onlyOnce = s6.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> String.valueOf(e.getKey()))
                .collect(Collectors.joining());
        System.out.println("6. " + onlyOnce);

        // Remove Non-Alphanumeric Characters
        String s7 = "ja@va#8!!";
        String alphanumeric = s7.chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("7. " + alphanumeric);

        // Keep Only Alphabets
        String s8 = "java8stream2025";
        String alphabets = s8.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("8. " + alphabets);

        // Keep Only Digits
        String s9 = "orderId=AB123XZ9";
        String digits = s9.chars()
                .filter(Character::isDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("9. " + digits);

        // Count Each Character Except Spaces
        String s10 = "java stream";
        Map<Character, Long> freqNoSpace = s10.chars()
                .filter(c -> c != ' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("10. " + freqNoSpace);
    }
}
