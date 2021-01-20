package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int yearOfPublishment) {
        super(yearOfPublishment);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning linux on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning linux off.");
    }
}
