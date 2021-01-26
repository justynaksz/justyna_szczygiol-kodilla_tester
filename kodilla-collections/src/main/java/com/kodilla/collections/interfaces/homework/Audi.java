package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;

    public Audi() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 40;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 40;
    }
}
