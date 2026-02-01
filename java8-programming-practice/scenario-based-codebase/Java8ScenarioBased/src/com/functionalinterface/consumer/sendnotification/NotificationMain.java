package com.functionalinterface.consumer.sendnotification;

import java.util.function.Consumer;

public class NotificationMain {

    public static void main(String[] args) {

        User u1 = new User("Arjun", "arjun@mail.com");
        User u2 = new User("Meera", "meera@mail.com");

        Consumer<User> sendNotification = user -> {
            System.out.println("Sending notification to: " + user.getName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Message: Your transaction was successful.");
            System.out.println("Notification Sent");
            System.out.println();
        };

        sendNotification.accept(u1);
        sendNotification.accept(u2);
    }
}
