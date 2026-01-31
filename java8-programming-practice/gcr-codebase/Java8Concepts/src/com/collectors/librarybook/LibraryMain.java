package com.collectors.librarybook;

import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

public class LibraryMain {

    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("Java Basics", "Education", 300),
                new Book("Spring Boot Guide", "Education", 450),
                new Book("Mystery House", "Fiction", 280),
                new Book("Space Odyssey", "Fiction", 500),
                new Book("World History", "History", 600)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getGenre,
                        Collectors.summarizingInt(Book::getPages)
                ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
            System.out.println("----------------------");
        });
    }
}
