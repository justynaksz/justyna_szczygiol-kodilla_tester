package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Audi audi = new Audi(100);
        cars.add(audi);
        cars.add(new Toyota(80));
        cars.add(new Ferrari(200));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(new Ferrari(200));
        cars.remove(1);


        System.out.println("-----------------------------");
        System.out.println("Number of cars in the list: " + cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
