package org.task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(1, 100);
        String [] results = fizzBuzz.fizzBuzzImplementation(3, 5);
        System.out.println(Arrays.toString(results));
    }
}
