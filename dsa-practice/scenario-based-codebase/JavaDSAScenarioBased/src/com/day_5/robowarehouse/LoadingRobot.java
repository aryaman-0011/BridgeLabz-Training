package com.day_5.robowarehouse;

public class LoadingRobot {
    private Shelf shelf;

    public LoadingRobot(Shelf shelf) {
        this.shelf = shelf;
    }

    public void loadPackage(int weight) {
        PackageItem item = new PackageItem(weight);
        shelf.insertPackage(item);
    }
}
