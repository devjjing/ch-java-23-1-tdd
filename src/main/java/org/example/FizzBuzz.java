package org.example;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        String result;
        if (number % 15 == 0) {
            result = "Fizz Buzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            return String.valueOf(number);
        }

        return result;
    }
}
