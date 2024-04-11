package Part1;
import java.util.Scanner;


public class Variables {
    public static void main(String[] args) {
        String text = "contains text";
        int wholeNumber = 123;
        double pi = 3.14;
        boolean isHappy = false;

        isHappy = true;

        System.out.println(isHappy);

        // int can be cast to double
        double floatingPoint = wholeNumber;

//        intInputExercise();
//        doubleInputExercise();
        boolInputExercise();
    }

    public static void intInputExercise() {
        Scanner scanner = new Scanner(System.in);
        int value;

        System.out.println("Give me a number");

        value = Integer.valueOf(scanner.nextLine());

        System.out.println("You gave me the num " + value);

    }
    public static void doubleInputExercise() {
        Scanner scanner = new Scanner(System.in);
        double value;

        System.out.println("Give me a double");

        value = Double.valueOf(scanner.nextLine());

        System.out.println("You gave me the double " + value);

    }
    public static void boolInputExercise() {
        Scanner scanner = new Scanner(System.in);
        boolean value;

        System.out.println("Write something: ");

        // string must be "true" in order for it to be true, case-insentive
        // all other strings cast to false.
        value = Boolean.valueOf(scanner.nextLine());

        System.out.println("True or false? " + value);

    }
}
