package com.employeeops;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class OpsMain {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", 30, "Male", "HR", 2012, 30000),
				new Employee(2, "Neha", 28, "Female", "Sales", 2016, 28000),
				new Employee(3, "Raj", 35, "Male", "IT", 2010, 50000),
				new Employee(4, "Sneha", 26, "Female", "Product Development", 2018, 45000),
				new Employee(5, "Karan", 32, "Male", "Sales", 2014, 32000),
				new Employee(6, "Pooja", 29, "Female", "HR", 2019, 27000),
				new Employee(7, "Vikram", 40, "Male", "Product Development", 2008, 70000),
				new Employee(8, "Anjali", 31, "Female", "IT", 2013, 48000));

		System.out.println("1." + employees.stream()
				.collect(Collectors.groupingBy(employee -> employee.getGender(), Collectors.counting())));

		System.out.print("2.");
		employees.stream().map(employee -> employee.getDepartment()).distinct().forEach(e -> System.out.print(e + " "));

		System.out.println("\n3." + employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));

		System.out.println("4." + employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get());

		System.out.print("5.");
		employees.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(e -> System.out.print(e + " "));

		System.out.println("\n6."
				+ employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));

		System.out.println("7." + employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))));

		System.out.println("8." + employees.stream()
				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Product Development"))
				.min(Comparator.comparingInt(Employee::getAge)).get());

		System.out.println("9." + employees.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get());

		System.out.println("10. " + employees.stream().filter(e -> e.getDepartment().equals("Sales"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));

		System.out.println("11." + employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));

		System.out.print("12." + employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.mapping(Employee::getName, Collectors.toList()))));

		DoubleSummaryStatistics stats = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("\n13." + "Avg: " + stats.getAverage() + " Total: " + stats.getSum());

		System.out.print("14.");
		employees.stream().filter(e -> e.getSalary() > 25000).forEach(System.out::println);

		System.out.println("15." + employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get());


		System.out.println("16." + employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.skip(1).findFirst().get());

		System.out.println("17." + employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.skip(2).findFirst().get());
		
		System.out.println("18." + employees.stream().min(Comparator.comparingDouble(Employee::getSalary)).get());
		
		System.out.println("19." + employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst().get());
		
		System.out.println("20.");
		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).limit(5).forEach(System.out::println);
		
		System.out.println("21.");
		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(5).forEach(System.out::println);


	}
}
