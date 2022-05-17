package it.hillel.homework.calculator.basic;

import java.util.Arrays;

public class Calculator {

    double sum(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    double sum(double ... values) {
        return Arrays.stream(values).sum();
    }

    double subtract(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    double multiply(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    double divide(double firstValue, double secondValue) {
        return firstValue / secondValue;
    }
}
