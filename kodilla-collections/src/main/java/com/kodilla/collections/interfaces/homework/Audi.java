package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return this.speed += 40;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 40;
    }
}
