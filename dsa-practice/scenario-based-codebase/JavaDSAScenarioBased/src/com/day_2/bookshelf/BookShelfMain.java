package com.day_2.bookshelf;

public class BookShelfMain {
	
	public static void main (String[] args) {
		
		BookShelf shelf = new BookShelf();
		
		shelf.addBook("Programming", "Java");
		shelf.addBook("Programming", "C++");
		shelf.addBook("Fantasy", "Game of Thornes");
		
		shelf.addBook("Fantasy", "Vikings");
		
		shelf.displayBook();
		
		shelf.removeBook("Fantasy", "Vikings");
		
		shelf.displayBook();
	}
}
