package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {

    public static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(1.78, 49.5, "Severely underweight"),
                Arguments.of(1.57, 60, "Normal (healthy weight)"),
                Arguments.of(2.05, 300, "Obese Class VI (Hyper Obese)"),
                Arguments.of(1.86, 95, "Overweight"),
                Arguments.of(1.67, 41, "Very severely underweight")
        );
    }
}
