package Part2;
import java.util.Scanner;

public class Patterns {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        squareEx();

//        squareRootEx();
//        absValEx();
    }

    public static void squareEx() {
        int input, square;

        System.out.println("Enter a number to square: ");

        input = Integer.valueOf(scanner.nextLine());

        square = input * input;

        System.out.println(square);
    }
    public static void squareRootEx() {
        double input, sqrt;

        System.out.println("Enter a number get sqrt: ");

        input = Double.valueOf(scanner.nextLine());

        sqrt = Math.sqrt(input);

        System.out.println(sqrt);
    }
    public static void absValEx() {
        int input, abs;

        System.out.println("Enter a number get abs val: ");

        input = Integer.valueOf(scanner.nextLine());

        abs = (input < 0) ? -input : input;

        System.out.println(abs);
    }
}

