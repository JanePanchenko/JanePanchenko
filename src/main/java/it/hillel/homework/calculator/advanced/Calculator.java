package it.hillel.homework.calculator.advanced;

import java.util.List;

public class Calculator {

    public int calculate(String expression) {
        InputHelper inputHelper = new InputHelper(expression);

        int firstArgument = inputHelper.getFirstArgument();
        int secondArgument = inputHelper.getSecondArgument();
        char operation = inputHelper.getOperation();

        if (operation == '+') {
            return firstArgument + secondArgument;
        } else {
            return firstArgument - secondArgument;
        }
    }

    public int sumAllNumbersFromExpression(String expression) {
        DigitInputHelper digitInputHelper = new DigitInputHelper();
        List<Integer> numbersFromExpression = digitInputHelper.getAllNumbersFromExpression(expression);
        return sumNumbers(numbersFromExpression);
    }

    private int sumNumbers(List<Integer> numbers) {
        int sum = 0;
        for(Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
