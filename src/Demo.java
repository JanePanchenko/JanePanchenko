import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = console.nextInt();

        int[] inputArray = new int[size];
        int amountOfPositiveNumbers = 0;
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Enter value: ");
            inputArray[i] = console.nextInt();

            if (inputArray[i] > 0) {
                amountOfPositiveNumbers++;
            }
        }

        int[] resultArray = new int[amountOfPositiveNumbers];
        int positiveNumbersIndex = 0;

        for (int inputArrayValue : inputArray) {
            if (inputArrayValue > 0) {
                resultArray[positiveNumbersIndex++] = inputArrayValue;
            }
        }

        for (int resultArrayValue : resultArray) {
            System.out.print("[" + resultArrayValue + "]");
        }
    }
}