package it.hillel.homework.calculator.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitInputHelper {

    public List<Integer> getAllNumbersFromExpression(String expression) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(expression);
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            String groupValue = matcher.group();
            numbers.add(Integer.parseInt(groupValue));
        }
        return numbers;
    }
}
