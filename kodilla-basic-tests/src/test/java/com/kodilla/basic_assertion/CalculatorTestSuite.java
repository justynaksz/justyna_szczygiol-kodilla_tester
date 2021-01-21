package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSqrtNegativeNumber() {
        Calculator calculator = new Calculator();
        int a = -3;
        int sqrtResult = calculator.sqrt(a);
        assertEquals(9, sqrtResult);
    }

    @Test
    public void testSqrtZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int sqrResult = calculator.sqrt(a);
        assertEquals(0,sqrResult);
    }

    @Test
    public void testSqrtPositive() {
        Calculator calculator = new Calculator();
        int a = 4;
        int sqrResult = calculator.sqrt(a);
        assertEquals(16,sqrResult);
    }
}
