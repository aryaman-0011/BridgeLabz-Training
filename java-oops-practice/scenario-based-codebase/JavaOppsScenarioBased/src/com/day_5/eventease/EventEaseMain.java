package com.day_5.eventease;

public class EventEaseMain {

    public static void main(String[] args) {

        User organizer = new User(
                "Aryaman",
                "aryaman@gmail.com",
                "9876543210"
        );

        Event birthday = new BirthdayEvent(
                "Aryaman Birthday",
                "Delhi",
                "12-04-2026",
                50,
                organizer,
                15000,
                5000
        );

        Event conference = new ConferenceEvent(
                "Tech Conference",
                "Bangalore",
                "20-05-2026",
                300,
                organizer,
                50000,
                20000
        );

        birthday.schedule();
        conference.schedule();
    }
}