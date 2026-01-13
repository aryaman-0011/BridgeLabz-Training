package com.day_3.examproctor;

public class ExamProctorMain {

    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        // Setup correct answers
        exam.correctAnswers.put(1, "A");
        exam.correctAnswers.put(2, "B");
        exam.correctAnswers.put(3, "C");

        // Student navigation
        exam.visitQuestion(1);
        exam.answerQuestion(1, "A");

        exam.visitQuestion(2);
        exam.answerQuestion(2, "C");

        exam.visitQuestion(3);
        exam.answerQuestion(3, "C");

        exam.goBack();

        // Submit exam
        int score = exam.calculateScore();
        System.out.println("\nFinal Score: " + score);
    }
}
