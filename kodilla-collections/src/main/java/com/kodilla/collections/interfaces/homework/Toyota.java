package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed;

    public Toyota(int speed) {
        this.speed = speed;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return this.speed += 35;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 20;
    }
}


