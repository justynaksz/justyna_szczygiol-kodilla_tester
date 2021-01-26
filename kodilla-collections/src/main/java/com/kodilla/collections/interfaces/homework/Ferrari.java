package com.kodilla.collections.interfaces.homework;

public class Ferrari implements Car {
    private int speed;

    public Ferrari() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 80;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 55;
    }
}
