package com.day_5.edumentor;

import java.util.*;

public class EduMentorMain {
	public static void main(String[] args) {

		Learner learner = new Learner(1, "Aryaman", "aryaman@edumentor.com", "short");
		Instructor instructor = new Instructor(101, "Dr. Mehta", "mehta@edumentor.com", "AI");

		List<String> questions = Arrays.asList("Java is OOP?", "Interface supports multiple inheritance?");
		List<String> answers = Arrays.asList("yes", "yes");

		Quiz quiz = new Quiz(questions, answers);

		List<String> userAnswers = Arrays.asList("yes", "yes");
		quiz.evaluate(userAnswers);

		learner.printDetails();
		System.out.println("Quiz Percentage: " + quiz.calculatePercentage());
		learner.generateCertificate();

		System.out.println();
		instructor.printDetails();
	}
}