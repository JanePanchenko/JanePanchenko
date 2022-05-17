package it.hillel.homework.array;

public class ArrayController {

    int getAmountOfPositiveNumbers(int[] inputArray) {
        int amountOfPositiveNumbers = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (isPositiveValue(inputArray[i])) {
                amountOfPositiveNumbers++;
            }
        }
        return amountOfPositiveNumbers;
    }

    int[] filterPositiveNumbers(int[] inputArray) {
        int amountOfPositiveNumbers = getAmountOfPositiveNumbers(inputArray);
        int[] resultArray = new int[amountOfPositiveNumbers];

        int positiveNumbersIndex = 0;
        for (int inputArrayValue : inputArray) {
            if (isPositiveValue(inputArrayValue)) {
                resultArray[positiveNumbersIndex++] = inputArrayValue;
            }
        }
        return resultArray;
    }

    boolean isPositiveValue(int number) {
        return number > 0;
    }
}
