package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ferrari ferrari = (Ferrari) o;
        return speed == ferrari.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
