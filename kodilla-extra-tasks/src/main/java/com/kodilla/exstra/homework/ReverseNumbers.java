package com.kodilla.exstra.homework;

public class ReverseNumbers {
    public static Integer reverseNumbers(Integer number) {
        String stringNumber = number.toString();
        char[] numberArray = stringNumber.toCharArray();
        int size = numberArray.length;
        char[] newNumberArray = new char[size];
        for (int i = 0; i < size; i++) {
            char indexNumber = numberArray [i];
            newNumberArray[size - 1 - i] = indexNumber;
        }
        String reversedStringNumber = String.valueOf(newNumberArray);
        Integer reversedNumber = Integer.valueOf(reversedStringNumber);
        System.out.println("Number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
        return reversedNumber;
    }
}







