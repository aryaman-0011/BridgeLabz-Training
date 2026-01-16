package com.day_5.robowarehouse;

public class RoboWarehouseMain {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        LoadingRobot robot = new LoadingRobot(shelf);

        robot.loadPackage(10);
        robot.loadPackage(3);
        robot.loadPackage(7);
        robot.loadPackage(1);
        robot.loadPackage(5);

        System.out.println("Shelf order (ascending by weight):");
        shelf.displayShelf();
    }
}

