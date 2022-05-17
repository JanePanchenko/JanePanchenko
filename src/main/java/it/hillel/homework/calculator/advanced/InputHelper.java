package it.hillel.homework.calculator.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHelper {

    private Pattern pattern;
    private Matcher matcher;
    private String expression;

    public InputHelper(String expression) {
        this.expression = expression;
        pattern = Pattern.compile("^\\d+\\s*[+-]\\s*\\d+$");
        matcher = pattern.matcher(expression);
        if (!isStringCorrect()) {
            throw new RuntimeException("String is not correct");
        }
    }

    public int getFirstArgument() {
        String firstArgument = getGroupByRegex("^(\\d+)");
        return Integer.parseInt(firstArgument);
    }

    public int getSecondArgument() {
        String secondArgument = getGroupByRegex("(\\d+)$");
        return Integer.parseInt(secondArgument);
    }

    public char getOperation() {
        String operation = getGroupByRegex("([+-])");
        return operation.charAt(0);
    }

    public String getGroupByRegex(String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(expression);
        matcher.find();
        return matcher.group();
    }

    private boolean isStringCorrect() {
        return matcher.matches();
    }
}
