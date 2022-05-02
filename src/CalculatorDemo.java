public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sumResult = calculator.sum(5, 7986584.44);
        System.out.println("5 + 7986584.44 = " + sumResult);

        double subtractionResult = calculator.subtract(459.55, 84.44);
        System.out.println("459.55 - 84.44 = " + subtractionResult);

        double multiplicationResult = calculator.multiply(47.9, 77.2);
        System.out.println("47.9 * 77.2 = " + multiplicationResult);

        double divisionResult = calculator.divide(10080, 222);
        System.out.println("10080 / 222 = " + divisionResult);

        double sumOfMultipleValues = calculator.sum(5, 7986584.44, 66, 124.77);
        System.out.println("5 + 7986584.44 + 66 + 124.77 = " + sumOfMultipleValues);

    }
}
