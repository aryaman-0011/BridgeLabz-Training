package com.day_3.examproctor;

import java.util.*;

public class ExamProctor {

    // Stack to track question navigation
    Stack<Integer> navigationStack = new Stack<>();

    // Store answers: questionId -> answer
    HashMap<Integer, String> answerMap = new HashMap<>();

    // Correct answers (answer key)
    HashMap<Integer, String> correctAnswers = new HashMap<>();

    // Visit a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Answer a question
    public void answerQuestion(int questionId, String answer) {
        answerMap.put(questionId, answer);
        System.out.println("Answered Q" + questionId + ": " + answer);
    }

    // Go back to last question
    public void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        System.out.println("Back from Question: " + navigationStack.pop());
    }

    // Calculate score
    public int calculateScore() {
        int score = 0;

        for (int qId : answerMap.keySet()) {
            if (answerMap.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
