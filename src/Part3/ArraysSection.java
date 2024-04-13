package Part3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysSection {
    public static void main(String[] args) {
        // int array of size 2
        // int[] numbers = new int[3];

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        // you can reassign but you cant add more vals
        numbers[1] = 3; // fine

        try {
            numbers[numbers.length + 1] = 1; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println(err);
        }

        System.out.print("nums: ");
        printArray(numbers);

        IntStream filteredNumbersStream = Arrays.stream(numbers).filter((num) -> num < 4);
        int[] filteredNumbers = filteredNumbersStream.toArray();

        System.out.print("filtered nums: ");
        printArray(filteredNumbers);

        // this works just fine
        //        for (int number : numbers) {
        //            System.out.print("[");
        //        }

        //        System.out.println(filteredNumbers.length);

        //        System.out.println(numbers.length);
    }

    public static void printArray(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            boolean isLastElement = i == array.length - 1;

            System.out.print((isLastElement ? array[i] : array[i] + ", "));
        }

        System.out.print("]\n");
    }

    public static void printArray(String[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            boolean isLastElement = i == array.length - 1;

            System.out.print((isLastElement ? array[i] : array[i] + ", "));
        }

        System.out.print("]\n");
    }
}
