package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSource#provideDataForTestingBMI")
    public void shouldCalculateBMI(double height, double weight, String expectedMessage) {
        Person person = new Person(height, weight);
        assertEquals(expectedMessage, person.getBMI());
    }




}