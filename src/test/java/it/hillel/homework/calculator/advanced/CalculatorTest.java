package it.hillel.homework.calculator.advanced;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        Assert.assertEquals(4, calculator.calculate("2 + 2"));
        Assert.assertEquals(60, calculator.calculate("20 + 40"));
        Assert.assertEquals(600, calculator.calculate("200 + 400"));
        Assert.assertEquals(600, calculator.calculate("200         +  400"));
        Assert.assertEquals(600, calculator.calculate("200+400"));
    }

    @Test
    public void testMinus() {
        Assert.assertEquals(2, calculator.calculate("4 - 2"));
        Assert.assertEquals(20, calculator.calculate("40 - 20"));
    }

    @Test
    public void shouldCalculateNumbersWhenTheyAreSeparatedBySpace() {
        int actual = calculator.sumAllNumbersFromExpression("9 9 4");

        Assert.assertEquals(22, actual);
    }

    @Test
    public void shouldCalculateNumbersWhenThereAreLettersAmongThem() {
        int actual = calculator.sumAllNumbersFromExpression("9 djfl   9hfkfd1hhj ");

        Assert.assertEquals(19, actual);
    }

    @Test
    public void shouldCalculateNumbersWhenThereAreSymbolsAmongThem() {
        int actual = calculator.sumAllNumbersFromExpression("+=9_(&9(?>7))");

        Assert.assertEquals(25, actual);
    }

    @Test
    public void shouldCalculateNumbersWhenThereAreLettersAndSymbolsAmongThem() {
        int actual = calculator.sumAllNumbersFromExpression("7))(djfl ...  9hfkfd5h#$hj }");

        Assert.assertEquals(21, actual);
    }

    @Test
    public void shouldCalculateNumbersWhenThereAreZerosAmongThem() {
        int actual = calculator.sumAllNumbersFromExpression("9 0000 9 0000");

        Assert.assertEquals(18, actual);
    }

    @Test
    public void shouldReturnZeroWhenThereAreOnlyLettersAndSymbols() {
        int actual = calculator.sumAllNumbersFromExpression(")))*&^%$dj$%flhf^!@#$kfdhhj%h");

        Assert.assertEquals(0, actual);
    }
}
