package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {

    public static void describeCar (Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    public static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        if (car instanceof Toyota)
            return "Toyota";
        if (car instanceof Ferrari)
            return "Ferrari";
        else
            return "Unknown car type";
    }
}
