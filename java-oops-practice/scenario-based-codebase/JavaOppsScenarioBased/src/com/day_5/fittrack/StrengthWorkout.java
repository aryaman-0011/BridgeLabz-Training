package com.day_5.fittrack;

public class StrengthWorkout extends Workout {
	StrengthWorkout(int duration) {
		super("Strength", duration);
	}
	
	@Override
	double calculateCalories(double weight) {
		double calories = duration * weight * 0.05;
		setCaloriesBurned(calories);
		return calories;
	}
}
