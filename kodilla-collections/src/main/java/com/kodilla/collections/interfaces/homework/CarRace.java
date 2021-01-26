package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi();
        doRace(audi);

        Toyota toyota = new Toyota();
        doRace(toyota);

        Ferrari ferrari = new Ferrari();
        doRace(ferrari);
        }

    public static void doRace (Car car) {
        // jak kilkukrotnie wywolac te same metody bez ich przepisywania?
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
