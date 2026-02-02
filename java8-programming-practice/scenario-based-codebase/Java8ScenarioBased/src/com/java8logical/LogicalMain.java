package com.java8logical;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	double getSalary() {
		return salary;
	}

	public String toString() {
		return name + " " + salary;
	}
}

public class LogicalMain {
	public static void main(String[] args) {

		System.out.println("1. Vowels: "
				+ "programming".chars().mapToObj(c -> (char) c).filter(c -> "aeiou".indexOf(c) != -1).count());

		System.out.println("2. Word Count: " + Arrays.stream("Java is very powerful".split(" ")).count());

		System.out.println("3. Evens: " + Arrays.asList(2, 5, 7, 8, 10, 13).stream().filter(n -> n % 2 == 0).toList());

		System.out.println(
				"4. Uppercase: " + Arrays.asList("java", "spring", "boot").stream().map(String::toUpperCase).toList());

		System.out.println(
				"5. Lengths: " + Arrays.asList("cat", "elephant", "dog").stream().map(String::length).toList());

		System.out.println("6. Count start with a: "
				+ Arrays.asList("apple", "banana", "ant", "car").stream().filter(s -> s.startsWith("a")).count());

		System.out.println("7. No Empty: "
				+ Arrays.asList("java", "", "spring", "", "boot").stream().filter(s -> !s.isEmpty()).toList());

		System.out.println("8. Sum: " + Arrays.asList(1, 2, 3, 4, 5).stream().mapToInt(i -> i).sum());

		System.out.println("9. Max: " + Arrays.asList(10, 25, 3, 99, 45).stream().max(Integer::compare).get());

		System.out.println("10. Reversed: "
				+ Arrays.asList("java", "api").stream().map(s -> new StringBuilder(s).reverse().toString()).toList());

		System.out.println("11. Distinct: " + Arrays.asList(1, 2, 2, 3, 4, 4, 5).stream().distinct().toList());

		System.out.println(
				"12. Desc Sort: " + Arrays.asList(5, 1, 9, 3).stream().sorted(Comparator.reverseOrder()).toList());

		System.out.println("13. Second Highest: "
				+ Arrays.asList(10, 40, 30, 20).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

		System.out.println("14. Joined: " + String.join(",", Arrays.asList("Java", "Spring", "Boot")));

		System.out.println("15. Char Freq: " + "banana".chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		System.out.println("16. >50: " + Arrays.asList(10, 55, 60, 23, 90).stream().filter(n -> n > 50).toList());

		System.out.println("17. Grouped Length: "
				+ Arrays.asList("a", "bb", "ccc", "dd").stream().collect(Collectors.groupingBy(String::length)));

		System.out.println("18. First Non-Repeat: " + "stress".chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().get());

		System.out.println("19. Int->String List: " + Arrays.asList(1, 2, 3).stream().map(String::valueOf).toList());

		System.out.println("20. Word Freq: " + Arrays.stream("java is java and java is fast".split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		System.out.println("21. Partition: "
				+ Arrays.asList(1, 2, 3, 4, 5, 6).stream().collect(Collectors.partitioningBy(n -> n % 2 == 0)));

		Set<Integer> seen = new HashSet<>();
		System.out.println("22. Duplicates: "
				+ Arrays.asList(1, 2, 3, 2, 4, 5, 1).stream().filter(n -> !seen.add(n)).distinct().toList());

		System.out.println("23. Longest: " + Arrays.asList("java", "microservices", "api").stream()
				.max(Comparator.comparingInt(String::length)).get());

		System.out.println("24. Top 3: "
				+ Arrays.asList(10, 90, 30, 70, 50).stream().sorted(Comparator.reverseOrder()).limit(3).toList());

		System.out.println("25. Flatten: "
				+ Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5)).flatMap(List::stream).toList());

		System.out.println("26. Sum Squares Even: "
				+ Arrays.asList(1, 2, 3, 4, 5).stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum());

		System.out.println("27. Sorted Map by Value: " + Stream
				.of(Map.entry("A", 3), Map.entry("B", 1), Map.entry("C", 2)).sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)));

		System.out.println("28. Max Salary Employee: " + Arrays.asList(new Employee("A", 5000), new Employee("B", 9000))
				.stream().max(Comparator.comparing(Employee::getSalary)).get());

		System.out.println("29. Common Elements: "
				+ Arrays.asList(1, 2, 3, 4).stream().filter(Arrays.asList(3, 4, 5, 6)::contains).toList());

		System.out.println(
				"30. 2nd Smallest: " + Arrays.asList(9, 1, 5, 3, 7).stream().sorted().skip(1).findFirst().get());
	}
}
