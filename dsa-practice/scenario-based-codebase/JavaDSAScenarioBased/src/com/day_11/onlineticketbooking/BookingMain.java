package com.day_11.onlineticketbooking;

public class BookingMain {
    public static void main(String[] args) {

        EventBST system = new EventBST();

        system.addEvent(new Event(1, "Music Fest", 1800));
        system.addEvent(new Event(2, "Tech Talk", 1400));
        system.addEvent(new Event(3, "Comedy Show", 2000));
        system.addEvent(new Event(4, "Workshop", 1600));

        system.showEvents();

        System.out.println("\n❌ Event at 1600 cancelled\n");
        system.cancelEvent(1600);

        system.showEvents();
    }
}
