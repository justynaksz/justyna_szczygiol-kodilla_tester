package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarApplications {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(16);
        Car[] cars = new Car[size];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawCarType = random.nextInt(3);
        int carSpeed = random.nextInt(250);
        if (drawCarType == 0)
            return new Audi(carSpeed);
        else if (drawCarType == 1)
            return new Toyota(carSpeed);
        else
            return new Ferrari(carSpeed);
    }
}
