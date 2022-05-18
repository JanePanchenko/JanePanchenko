
public class Demo {

    public static void main(String[] args) {
        ConsoleController consoleController = new ConsoleController();
        ArrayController arrayController = new ArrayController();

        int[] inputArray = consoleController.getArrayFromConsole();
        int[] resultArray = arrayController.filterPositiveNumbers(inputArray);

        consoleController.outLn("Result array: ");
        consoleController.printArray(resultArray);
    }
}