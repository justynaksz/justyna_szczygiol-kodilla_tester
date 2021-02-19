package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine machine = new GamblingMachine();
    Set<Integer> userNumbers = new HashSet<>();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTestNegative.csv")
    public void shouldThrowExceptionIfUserNumbersAreIncorrect(ArgumentsAccessor argument) {
        userNumbers.add(Integer.parseInt(argument.getString(0)));
        userNumbers.add(Integer.parseInt(argument.getString(1)));
        userNumbers.add(Integer.parseInt(argument.getString(2)));
        userNumbers.add(Integer.parseInt(argument.getString(3)));
        userNumbers.add(Integer.parseInt(argument.getString(4)));
        userNumbers.add(Integer.parseInt(argument.getString(5)));

        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));
        assertEquals("Wrong numbers provided", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfUserAddTooManyNumbers() {
        userNumbers.add(5);
        userNumbers.add(18);
        userNumbers.add(36);
        userNumbers.add(2);
        userNumbers.add(44);
        userNumbers.add(48);
        userNumbers.add(22);

        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));
        assertEquals("Wrong numbers provided", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfUserAddNotEnoughNumbers() {
        userNumbers.add(5);
        userNumbers.add(18);
        userNumbers.add(36);

        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));
        assertEquals("Wrong numbers provided", exception.getMessage());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTestPositive.csv")
    public void shouldCalculateCountIfUserNumbersAreCorrect(ArgumentsAccessor argument) throws InvalidNumbersException {
        userNumbers.add(Integer.parseInt(argument.getString(0)));
        userNumbers.add(Integer.parseInt(argument.getString(1)));
        userNumbers.add(Integer.parseInt(argument.getString(2)));
        userNumbers.add(Integer.parseInt(argument.getString(3)));
        userNumbers.add(Integer.parseInt(argument.getString(4)));
        userNumbers.add(Integer.parseInt(argument.getString(5)));

        int count = machine.howManyWins(userNumbers);

        assertTrue(count >=0 && count <= 6);
    }
}

