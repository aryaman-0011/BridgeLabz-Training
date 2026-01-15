package com.day_4.smartshelf;

import java.util.ArrayList;
import java.util.List;

public class SmartShelf {

    private List<Book> shelf = new ArrayList<>();

    // Insert book in sorted order (Insertion Sort idea)
    public void addBook(Book newBook) {
        int i = shelf.size() - 1;

        // Shift books to the right until correct position found
        while (i >= 0 && shelf.get(i).title.compareToIgnoreCase(newBook.title) > 0) {
            i--;
        }

        // Insert at correct position
        shelf.add(i + 1, newBook);
    }

    public void displayShelf() {
        for (Book book : shelf) {
            System.out.print(book + " | ");
        }
        System.out.println();
    }
}
