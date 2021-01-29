package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Los Angeles", "23x40", true));
        stamps.add(new Stamp(" Oslo", "20x38", false));
        stamps.add(new Stamp("Los Angeles", "23x40", true));
        stamps.add(new Stamp("Warsaw", "22x39", true));
        stamps.add(new Stamp("Warsaw", "22x39", true));
        stamps.add(new Stamp("Paris", "26x43", false));

        System.out.println("Number of stamps: " + stamps.size());
        System.out.println("-------------------");
        for(Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
