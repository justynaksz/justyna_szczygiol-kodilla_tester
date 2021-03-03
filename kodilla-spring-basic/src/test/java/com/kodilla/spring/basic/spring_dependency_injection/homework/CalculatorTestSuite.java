package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldDisplayValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        String message = bean.display(5.0);
        Assertions.assertEquals("Value: 5.0", message);
    }

    @ParameterizedTest
    @CsvSource(value = {"10,20,30", "2,1,3", "0.15,0.01,0.16", "0,0,0", "-15,30,15", "-30,-30,-60", "-120,50,-70"})
    public void shouldAddValues(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(a, b);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"10,20,-10", "2,1,1", "0.15,0.02,0.13", "0,0,0", "-15,30,-45", "-30,-30,0", "-120,50,-170"})
    public void shouldSubtractValues(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(a, b);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"10,20,200", "2,1,2", "0.15,0.01,0.0015", "0,0,0", "-15,30,-450", "-30,-30,900", "-120,50,-6000"})
    public void shouldMultiplyValues(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(a, b);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"10,20,0.5", "2,1,2", "0.15,0.01,15", "5,0,Infinity", "-15,30,-0.5", "-30,-30,1", "-120,50,-2.4"})
    public void shouldDivideValues(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(a, b);
        Assertions.assertEquals(expected, result);
    }


}
