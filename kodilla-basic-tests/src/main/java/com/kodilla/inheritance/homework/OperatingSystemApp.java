package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2010);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Windows windows = new Windows(2018);
        windows.turnOn();
        windows.turnOff();

        Linux linux = new Linux(2005);
        linux.turnOn();
        linux.turnOff();
    }
}
