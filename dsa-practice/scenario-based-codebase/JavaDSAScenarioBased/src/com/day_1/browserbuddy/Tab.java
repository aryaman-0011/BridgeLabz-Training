package com.day_1.browserbuddy;

public class Tab {
	
	private Page current;
	
	public void visit(String url) {
		Page newPage = new Page(url);
		
		if(current != null) {
			current.next = null;
			newPage.prev = current;
			current.next = newPage;
		}
		
		current = newPage;
		System.out.println("Visited: " + url);
	}
	
	public void back() {
		if(current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Back to: " + current.url);
		} else {
			System.out.println("No previous page!");
		}
	}
	
	public void forward() {
		if(current != null && current.next != null) {
			current = current.next;
			System.out.println("Forward to: " + current.url);
		} else {
			System.out.println("No forward page!");
		}
	}
	
	public String getCurrentPage() {
		return current != null ? current.url : "Blank Tab";
	}
}
