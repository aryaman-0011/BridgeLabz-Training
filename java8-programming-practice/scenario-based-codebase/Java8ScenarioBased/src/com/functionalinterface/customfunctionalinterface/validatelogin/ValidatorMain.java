package com.functionalinterface.customfunctionalinterface.validatelogin;

public class ValidatorMain {

	public static void main(String[] args) {
		
		LoginValidator lv = (user, pass) -> user.equals("admin") && pass.equals("12!!");
		
		System.out.println("Login success: " + lv.validate("admin", "12!!1"));
	}
}
