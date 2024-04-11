package Part1;

import java.util.Scanner;

public class Conditionals {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        speedingTicketExercise();
//        adulthoodExercise();
//        largerThanOrEqualToEx();
//        gradesAndPointsEx();


        // string equality
        // use .equals

        String str1 = "boop!";
        String str2 = "boop!";

        System.out.println(str1 == str2); // true

        str1 = new String("boop!");
        str2 = new String("boop!");

        // false even though the value is technically the same.
        // they are now two different objects.
        System.out.println(str1 == str2); // false

        System.out.println(str1.equals(str2)); // true

        int year = 2000;
        System.out.println("leap year " + year + ": " + isLeapYear(year));
    }

    public static void speedingTicketExercise() {
        final int SPEED_LIMIT = 20;
        int input;

        System.out.println("Give speed: ");
        input = Integer.valueOf(scanner.nextLine());

        if (input > SPEED_LIMIT) {
            System.out.println("Speeding ticket!");
        }
    }

    public static void adulthoodExercise() {
        int input;

        System.out.println("How old are you?");
        input = Integer.valueOf(scanner.nextLine());

        if (input >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }

    public static void largerThanOrEqualToEx() {
        int input1, input2;

        System.out.println("First num: ");
        input1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Second num: ");
        input2 = Integer.valueOf(scanner.nextLine());

        if (input1 == input2) {
            System.out.println("Equal!");
        } else if (input1 > input2) {
            System.out.println(input1 + " > " + input2);
        } else {
            System.out.println(input1 + " < " + input2);
        }
    }

    public static void gradesAndPointsEx() {
        int input;
        String grade;

        System.out.println("Enter grade 0-100: ");
        input = Integer.valueOf(scanner.nextLine());

        if (input < 0) {
            grade = "impossible!";
        } else if (input <= 49) {
            grade = "failed";
        } else if (input <= 59) {
            grade = "1";
        } else if (input <= 69) {
            grade = "2";
        } else if (input <= 79) {
            grade = "3";
        } else if (input <= 89) {
            grade = "4";
        } else if (input <= 100) {
            grade = "5";
        } else {
            grade = "incredible!";
        }

        System.out.println(grade);
    }

    public static boolean isLeapYear(int year) {
       if (year % 4 != 0) {
           return false;
       }

       if (year % 100 != 0) {
           return true;
       }

       if (year % 400 == 0) {
           return true;
       }

       return false;
    }
}
