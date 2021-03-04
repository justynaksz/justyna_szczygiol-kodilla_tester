package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        return !time.isAfter(LocalTime.of(6, 0)) || !time.isBefore(LocalTime.of(22, 0));
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
