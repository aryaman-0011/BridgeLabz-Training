package com.day_2.bookshelf;

import java.util.*;

public class BookShelf {
	
	private HashMap<String, LinkedList<String>> catalog = new HashMap<>();
	
	public void addBook(String genre, String bookName) {
		
		catalog.putIfAbsent(genre, new LinkedList<>());
		
		if(!catalog.get(genre).contains(bookName)) {
			catalog.get(genre).add(bookName);
			System.out.println("Added: " + bookName);
		} else {
			System.out.println("Duplicate book not allowed!");
		}
	}
	
	public void removeBook(String genre, String bookName) {
		
		LinkedList<String> books = catalog.get(genre);
		
		if(books != null && books.remove(bookName)) {
			System.out.println("Removed book: " + bookName);
		} else {
			System.out.println("Book not found");
		}		
	}
	
	public void displayBook() {
		
		for(String genre : catalog.keySet()) {
			System.out.println("\nGenre: " + genre);
			
			for(String book : catalog.get(genre)) {
				System.out.println(" " + book);
			}
		}
		
	}
}
