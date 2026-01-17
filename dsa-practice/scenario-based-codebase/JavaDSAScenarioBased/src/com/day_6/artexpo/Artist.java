package com.day_6.artexpo;

public class Artist {

	String name;
	long registrationTime;
	
	public Artist(String name, long registrationTime) {
		this.name = name;
		this.registrationTime = registrationTime;
	}
	
	@Override
	public String toString() {
		return name + " (" + registrationTime + ")";
	}
}
