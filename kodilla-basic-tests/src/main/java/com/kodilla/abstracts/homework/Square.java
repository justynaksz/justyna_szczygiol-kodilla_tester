package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        super();
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
