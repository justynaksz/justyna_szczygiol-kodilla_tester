package com.kodilla.collections.interfaces.homework;

public class Ferrari implements Car {
    private int speed;

    public Ferrari(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return this.speed += 80;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 55;
    }
}
