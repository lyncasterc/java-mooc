package Part2;

import java.util.Scanner;

public class Loops {
    public static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
//        carryOnEx();
//        onlyPosEx();
//        numberOfNumbersEx();
//        numberOfNegNumbersEx();
//        numberAndSumOfNumbersEx();
//        counting();
//        countingTo100();
//        sumOfSequence();
        factorial();
    }


    public static void carryOnEx() {
        String input;

        System.out.println("Hello! Type \"no\" to exit.");

        do {
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("no")) {
                System.out.println("Ok, let's carry on!");
            }
        } while (!input.equalsIgnoreCase("no"));

        System.out.println("Bye!");
    }

    public static void onlyPosEx() {
        int input;

        while (true) {
            System.out.println("Enter pos num: ");

            input = Integer.valueOf(scanner.nextLine());

            if (input < 0) {
                System.out.println("Unsuitable number");
            } else if (input == 0) {
                break;
            } else {
                System.out.println(input * input);
            }
        }
    }

    public static void numberOfNumbersEx() {
        int numberOfNumbers = 0, input;

        while (true) {
            System.out.println("Enter a num: ");
            input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            numberOfNumbers += 1;
        }

        System.out.println("Number of numbers: " + numberOfNumbers);
    }

    public static void numberAndSumOfNumbersEx() {
        int numberOfNumbers = 0, sum = 0, input;

        while (true) {
            System.out.println("Enter a num: ");
            input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            numberOfNumbers += 1;
            sum += input;
        }

        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of numbers: " + sum);
    }

    public static void numberOfNegNumbersEx() {
        int numberOfNumbers = 0, input;

        while (true) {
            System.out.println("Enter a num: ");
            input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                continue;
            }

            numberOfNumbers += 1;
        }

        System.out.println("Number of numbers: " + numberOfNumbers);
    }

    public static void counting() {
        int input;

        System.out.println("Enter number: ");
        input = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= input; i++) {
            System.out.println(i);
        }
    }
    public static void countingTo100() {
        int input;

        System.out.println("Enter number: ");
        input = Integer.valueOf(scanner.nextLine());

        for (int i = input; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void sumOfSequence() {
        int input, sum = 0;

        System.out.println("Enter number: ");
        input = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= input ; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
    public static void factorial() {
        int input, factorial = 1;

        System.out.println("Enter number: ");
        input = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= input ; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
