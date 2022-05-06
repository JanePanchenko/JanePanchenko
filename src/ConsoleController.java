import java.util.Scanner;

public class ConsoleController {

    Scanner scanner = new Scanner(System.in);

    void outLn(String value) {
        System.out.println(value);
    }

    void out(String value) {
        System.out.print(value);
    }

    int readInt() {
        return scanner.nextInt();
    }

    void printArray(int[] array) {
        for (int x : array) {
            out("[" + x + "]");
        }
        outLn("");
    }

    int[] getArrayFromConsole() {
        outLn("Enter size: ");
        int size = readInt();
        int[] array = new int[size];
        return fillArray(array);
    }

    int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            out("Enter value: ");
            array[i] = readInt();
        }
        return array;
    }
}
