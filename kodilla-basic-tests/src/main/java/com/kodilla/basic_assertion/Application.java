package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSubtract) {
            System.out.println("Metoda subtract dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int sqrtResult = calculator.sqrt(a);
        boolean correctSqrt = ResultChecker.assertEquals(25, sqrtResult);
        if (correctSqrt) {
            System.out.println("Metoda sqrt dziala poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda sqrt nie dziala poprawnie dla liczby " + a);
        }

    }
}
