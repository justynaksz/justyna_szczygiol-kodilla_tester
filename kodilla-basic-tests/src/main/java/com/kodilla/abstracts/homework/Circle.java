package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private int radius;
    private final double PI = 3.14;


    public Circle(int radius) {
        super();
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
