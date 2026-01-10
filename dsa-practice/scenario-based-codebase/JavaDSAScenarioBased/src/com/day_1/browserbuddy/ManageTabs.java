package com.day_1.browserbuddy;

import java.util.*;

public class ManageTabs {
	
	private Tab activeTab;
	private Stack<Tab> closedTabs;
	
	public ManageTabs() {
		this.activeTab = new Tab();
		this.closedTabs = new Stack<>(); 
	}
	
	public Tab getActiveTab() {
		return activeTab;
	}
	
	public void closeTab() {
		closedTabs.push(activeTab);
		activeTab = new Tab();
		System.out.println("Tab closed");
	}
	
	public void restoreTab() {
		if(!closedTabs.isEmpty()) {
			activeTab = closedTabs.pop();
			System.out.println("Tab Restored");
		} else {
			System.out.println("No tabs to restore!");
		}
	}
}
