package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows (int yearOfPublishment) {
        super(yearOfPublishment);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning windows on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning windows off.");
    }
}
