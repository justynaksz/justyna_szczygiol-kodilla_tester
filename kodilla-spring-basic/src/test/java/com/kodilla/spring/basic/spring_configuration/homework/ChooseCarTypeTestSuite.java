package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ChooseCarTypeTestSuite {


    @Test
    public void shouldReturnSUV() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car bean = (Car) context.getBean("chooseCar");
        String carType = bean.getCarType();
        Assertions.assertEquals("Sedan", carType);
    }

    @Test
    public void shouldHaveHeadLightsTurnedOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car bean = (Car) context.getBean("chooseCar");
        boolean lightsOn = bean.hasHeadlightsTurnedOn();
        Assertions.assertTrue(lightsOn);
    }
}
