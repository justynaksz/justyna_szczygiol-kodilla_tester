package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class ChooseCarType {

    @Bean
    public Car chooseCar() {
        Car car;
        int month = LocalDate.now().getMonthValue();
        if (month < 3 || month == 12) {
            car = new SUV();
        }
        else if (month > 5 && month < 9) {
            car = new Cabrio();
        }
        else {
            car = new Sedan();
        }
        return car;
    }

}
