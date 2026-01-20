package com.day_12.digicontact;

public class Contact {

	private String firstName;
	private String lastName;
	private long phoneNumber;
	private Address address;
	private String email;
	
	public Contact(String firstName, String lastName, long phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public Contact(String firstName, String lastName, long phoneNumber, String email ,Address address) {
		this(firstName, lastName, phoneNumber, email);
		this.address = address;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
	    return firstName + " " + lastName +
	           " | Phone: " + phoneNumber +
	           " | Email: " + email +
	           (address != null ? " | Address: " + address : "");
	}

}
