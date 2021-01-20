package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        double rectangleArea = rectangle.calculateArea();
        System.out.println(rectangleArea);
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println(rectanglePerimeter);

        Square square = new Square(13);
        double squareArea = square.calculateArea();
        System.out.println(squareArea);
        double squarePerimeter = square.calculatePerimeter();
        System.out.println(squarePerimeter);

        Circle circle = new Circle(7);
        double circleArea = circle.calculateArea();
        System.out.println(circleArea);
        double circlePerimeter = circle.calculatePerimeter();
        System.out.println(circlePerimeter);
    }
}
