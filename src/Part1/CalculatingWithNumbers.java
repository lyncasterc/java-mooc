package Part1;
import java.util.Scanner;

public class CalculatingWithNumbers {
    public static void main(String[] args) {
        System.out.println(2 + 2); // 4
        System.out.println(4 / 2); // 2
        // normal order of ops apply in Java
        System.out.println(1 + 1 + 3 * 2 + 5);

//        secondsInDayEx();


//        sumExercise();

        // for division, it does int division unless one of them is a double;

        System.out.println(3 / 2); // 1
        // casting 3 to double
        System.out.println((double) 3 / 2); // 1.5

        avgExercise();
    }

    public static void secondsInDayEx() {
        Scanner scanner = new Scanner(System.in);
        int numOfDays, secondsInDays;
        final int SECONDS_IN_DAY = 24 * 60 * 60;

        System.out.println("How many days?");
        numOfDays = Integer.valueOf(scanner.nextLine());

        secondsInDays = SECONDS_IN_DAY * numOfDays;

        System.out.println(secondsInDays + " seconds in " + numOfDays + "  days.");
    }
    public static void sumExercise() {
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] nums;
        int sum = 0;

        System.out.println("Enter positive numbers to add with no spaces: ");

        input = scanner.nextLine().trim();

        nums = input.split("");

        for (String num : nums) {
            try {
                sum += Integer.valueOf(num);
            } catch (NumberFormatException err) {
                System.out.println("you need to input only positive numbers with no spaces!");
                throw err;
            }
        }

        System.out.println("sum: " + sum);
    }
    public static void avgExercise() {
        Scanner scanner = new Scanner(System.in);
        double input1, input2, avg;

        System.out.println("Enter number 1: ");

        input1 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter number 2: ");

        input2 = Double.valueOf(scanner.nextLine());

        avg = (input1 + input2) / 2;

        System.out.println("Average: " + avg);
    }


}
