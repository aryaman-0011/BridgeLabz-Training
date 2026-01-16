package com.day_5.robowarehouse;

import java.util.*;

public class Shelf {
    private List<PackageItem> packages = new ArrayList<>();

    public void insertPackage(PackageItem item) {
        int i = packages.size() - 1;

        packages.add(null); 

        while (i >= 0 && packages.get(i).getWeight() > item.getWeight()) {
            packages.set(i + 1, packages.get(i));
            i--;
        }

        packages.set(i + 1, item);
    }

    public void displayShelf() {
        for (PackageItem p : packages) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
