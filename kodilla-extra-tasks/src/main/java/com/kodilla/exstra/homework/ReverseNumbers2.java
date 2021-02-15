package com.kodilla.exstra.homework;

public class ReverseNumbers2 {
    public static Integer reverseNumbers(Integer number) {
        String stringNumber = number.toString();
        StringBuffer stringBufferNumber = new StringBuffer(stringNumber);
        StringBuffer stringBufferReversed = stringBufferNumber.reverse();
        String stringReversedNumber = stringBufferReversed.toString();
        Integer reversedNumber = Integer.valueOf(stringReversedNumber);
        System.out.println("Number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
        return reversedNumber;
    }
}
