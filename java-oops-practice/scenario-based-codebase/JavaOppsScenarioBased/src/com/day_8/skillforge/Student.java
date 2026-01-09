package com.day_8.skillforge;

public class Student extends User {

	private int completedModules;
	private double progress;
	
	public Student(String name, String email) {
		super(name, email);
		this.completedModules = 0;
		this.progress = 0;
	}
	
	public void completeModule(int totalModules) {
		completedModules++;
		progress = (completedModules * 100.0) / totalModules;
	}
	
	public double getProgress() {
		return progress;
	}	
}
