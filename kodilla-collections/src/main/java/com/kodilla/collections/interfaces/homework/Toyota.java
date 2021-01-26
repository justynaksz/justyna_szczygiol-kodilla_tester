package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed;

    public Toyota() {
        this.speed = 0;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 35;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 20;
    }
}


