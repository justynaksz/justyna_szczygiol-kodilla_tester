package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfPublishment;

    public OperatingSystem(int yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;
    }

    public void turnOn() {
        System.out.println("Turning operating system on.");
    }

    public void  turnOff() {
        System.out.println("Turning operating system Off.");
    }
}