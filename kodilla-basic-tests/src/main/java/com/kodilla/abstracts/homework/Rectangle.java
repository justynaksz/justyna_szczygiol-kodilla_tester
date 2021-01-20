package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
}
