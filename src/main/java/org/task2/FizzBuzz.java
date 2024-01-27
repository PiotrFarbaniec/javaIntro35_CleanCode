package org.task2;

public class FizzBuzz {
    private int firstNumber;
    private int lastNumber;

    public FizzBuzz(int firstNumber, int lastNumber) {
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
    }

    public int [] createFizzBuzzArray () {
        int lenght = lastNumber-firstNumber+1;
        int [] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = firstNumber + i;
        }
        return array;
    }

    public String [] fizzBuzzImplementation(int... gameNumbers) {
        int[] gameArray = createFizzBuzzArray();
        String[] fizzArray = new String[gameArray.length];

        for (int i = 0; i < gameArray.length; i++) {
            if (gameArray[i] % (gameNumbers[0] * gameNumbers[1]) == 0) {
                fizzArray[i] = "FizzBuzz";
            } else if (gameArray[i] % gameNumbers[0] == 0) {
                fizzArray[i] = "Fizz";
            } else if (gameArray[i] % gameNumbers[1] == 0) {
                fizzArray[i] = "Buzz";
            } else {
                fizzArray[i] = "__";
            }
        }
        return fizzArray;
    }
}