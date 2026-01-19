package com.day_7.fitnesstracker;

public class FitnessTrackerMain {

	public static void main(String[] args) {
		
		User[] users = new User[20];
		int count = 0;
		
		users[count++] = new User("Harsh", 6000);
		BubbleSort.bubbleSort(users, count);
		
		users[count++] = new User("Harshit", 3000);
		BubbleSort.bubbleSort(users, count);
		
		users[count++] = new User("Shashwat", 8000);
		BubbleSort.bubbleSort(users, count);
		
		users[count++] = new User("Aryaman", 12000);
		BubbleSort.bubbleSort(users, count);
		
		users[count++] = new User("Kartik", 5000);
		BubbleSort.bubbleSort(users, count);
		
		System.out.println("------- LEADERBOARD --------");
		for(int i = 0; i < count; i ++) {
			System.out.println((i + 1) + ". " + users[i]);
		}
	}
}
