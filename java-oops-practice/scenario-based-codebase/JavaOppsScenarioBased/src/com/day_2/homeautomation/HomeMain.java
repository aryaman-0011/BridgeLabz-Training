package com.day_2.homeautomation;

public class HomeMain {

    public static void main(String[] args) {

        Appliance light = new Light("Living Room");
        Appliance fan = new Fan("Bedroom", 3);
        Appliance ac = new AC("Hall", 20);

        UserController controller = new UserController();

        controller.operateDevice(light, true);
        controller.operateDevice(fan, true);
        controller.operateDevice(ac, true);

        controller.compareUsage(ac, fan);
    }
}
