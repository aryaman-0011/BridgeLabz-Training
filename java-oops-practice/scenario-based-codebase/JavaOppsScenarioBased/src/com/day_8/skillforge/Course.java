package com.day_8.skillforge;

import java.util.*;

public abstract class Course implements ICertifiable {

    protected String title;
    protected Instructor instructor;
    protected List<String> modules;

    private double rating;
    private List<String> reviews;

    // Default modules constructor
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = List.of("Introduction", "Basics", "Final Project");
        this.rating = 0;
        this.reviews = new ArrayList<>();
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 0;
        this.reviews = new ArrayList<>();
    }

    // Protected rating logic (encapsulation)
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    // Internal review addition
    protected void addReview(String review) {
        reviews.add(review);
    }

    // Read-only reviews
    public List<String> getReviews() {
        return List.copyOf(reviews);
    }
}
