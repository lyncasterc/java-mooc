package Part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lists {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        /*
         *  primitive (value-type) variables:
         *   - stored directly on the stack with their value
         *
         * reference types:
         *   - stored in heap.
         *   - the variable itself does not contain the object,
         *   it contains a reference to it in memory (heap)
         * */

        int number = 1; // primitive variable

        nums.add(number); // auto-boxing. num is converted to Integer.

        nums.add(2);

        nums.add(0);

        System.out.println(nums); // [1, 2, 0]

        // getting element at index 1
        System.out.println(nums.get(1));

        // getting length of array
        System.out.println(nums.size());

        // removing element at index 2
        nums.remove(2);

        System.out.println(nums); // [1, 2]

        nums.add(42);

        System.out.println(nums); // [1, 2, 42]

        // removing by value
        nums.remove(Integer.valueOf(42));

        System.out.println(nums); // [1, 2]

        //        for (Integer num : nums) {
        //            System.out.println(num);
        //        }

        //        for (int i = 0; i < nums.size(); i++) {
        //            System.out.println(nums.get(i));
        //        }

        //        // reverse loop
        //        for (int i = nums.size() - 1; i >= 0; i--) {
        //            System.out.println(nums.get(i));
        //        }

        //        greatestInListEx();
        //        indexOfEx();
        inTheListEx();
    }

    public static void greatestInListEx() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int max = 0;

        System.out.println("Enter numbers to add them to a list, -1 stops program");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input < 0) {
                break;
            }

            nums.add(input);
        }

        for (Integer num : nums) {
            //            max = (max > num) ? max : num;
            max = Math.max(max, num);
        }

        System.out.println("Max: " + max);
    }

    public static void indexOfEx() {
        ArrayList<Integer> nums = new ArrayList<>();
        int searchNum;

        while (true) {
            System.out.println("Enter numbers: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input < 0) {
                break;
            }

            nums.add(input);
        }

        System.out.println("Enter num to search: ");
        searchNum = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == searchNum) {
                System.out.println(searchNum + " is at index: " + i);
            }
        }
    }

    public static void inTheListEx() {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Daisy"));
        String input;

        System.out.println("Enter name to search: ");
        input = scanner.nextLine();

        if (names.contains(input)) {
            System.out.println(input + " was found.");
        } else {
            System.out.println("Not Found.");
        }
    }
}
