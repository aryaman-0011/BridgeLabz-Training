package com.day_1.browserbuddy;

public class BrowserBuddyMain {
	
	public static void main (String[] args) {
		
		ManageTabs manageTab = new ManageTabs();
		Tab tab = manageTab.getActiveTab();
		
		tab.visit("google.com");
		tab.visit("youtube.com");
		tab.visit("github.com");
		
		tab.back();
		tab.back();
		tab.forward();
		
		System.out.println("Current Page: " + tab.getCurrentPage());
		
		manageTab.closeTab();
		
		manageTab.restoreTab();
		tab = manageTab.getActiveTab();
		
		System.out.println("Restored Page: " + tab.getCurrentPage());
		
	}
}
