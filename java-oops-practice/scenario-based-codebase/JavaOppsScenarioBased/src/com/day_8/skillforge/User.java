package com.day_8.skillforge;

public abstract class User {
	protected String name;
	protected String email;
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
    @Override
    public String toString() {
        return name;
    }
}
