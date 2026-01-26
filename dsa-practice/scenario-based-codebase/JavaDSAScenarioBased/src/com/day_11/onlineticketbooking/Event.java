package com.day_11.onlineticketbooking;

public class Event {
    int id;
    String name;
    int startTime; // use integer like 1300 for 1:00 PM

    public Event(int id, String name, int startTime) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Event: " + name + " | Time: " + startTime + " | ID: " + id;
    }
}
