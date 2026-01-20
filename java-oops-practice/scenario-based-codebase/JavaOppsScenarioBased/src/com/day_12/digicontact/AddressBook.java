package com.day_12.digicontact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddressBook {

	private ArrayList<Contact> contacts;
	
	public AddressBook() {
		this.contacts = new ArrayList<Contact>();
	}
	
	public void addNewContact(Contact newContact) {
		for(Contact existingContact : contacts) {
			if(existingContact.getEmail().equalsIgnoreCase(newContact.getEmail())) {
				System.out.println("Contact alredy exist");
				return;
			}
		}
		
		contacts.add(newContact);
		System.out.println("Contact added successfully");
	}
	
	public void editExistingContact(String email, String newFirstName, String newLastName) {

	    for (Contact existingContact : contacts) {

	        if (existingContact.getEmail().equalsIgnoreCase(email)) {

	            existingContact.setFirstName(newFirstName);
	            existingContact.setLastName(newLastName);

	            System.out.println("Contact updated successfully");
	            return;
	        }
	    }

	    System.out.println("Contact not found");
	}

	
	public void deleteContact(String email) {
		for(int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getEmail().equals(email)) {
				contacts.remove(i);
				System.out.println("Contact deleted successfully!");
				return;
			}
		}
		
		System.err.println("Contact not found!");
	}
	
	public List<Contact> searchByCity(String city) {
		List<Contact> result = new ArrayList<>();
		
		for(Contact contact : contacts) {
			
			Address address = contact.getAddress();
			
			if(address != null && address.getCity().equals(city)) {
				result.add(contact);
			}
		}
		
		return result;
	}
	
	public List<Contact> searchByState(String state) {
		List<Contact> result = new ArrayList<>();
		
		for(Contact contact : contacts) {
			Address address = contact.getAddress();
			
			if(address != null && address.getState().equals(state)) {
				result.add(contact);
			}
		}
		
		return result;
	}
	
	public void displayContactsSorted() {

	    if (contacts.isEmpty()) {
	        System.out.println("No contacts to display");
	        return;
	    }

	    Collections.sort(contacts, new Comparator<Contact>() {
	        @Override
	        public int compare(Contact c1, Contact c2) {

	            int firstNameCompare =
	                    c1.getFirstName().compareToIgnoreCase(c2.getFirstName());

	            if (firstNameCompare != 0) {
	                return firstNameCompare;
	            }

	            return c1.getLastName().compareToIgnoreCase(c2.getLastName());
	        }
	    });

	    for (Contact contact : contacts) {
	        System.out.println(contact);
	    }
	}
	
	
}
