package Part1;
import java.util.Scanner;
public class ReadingInput {
    public static void main(String[] args) {
//         Scanner is used to read input from the console
//         input is read as a string
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");

        // waits for user to input something and press enter
        String message = scanner.nextLine();

        // string concatenation
        System.out.println("You wrote: " + message);

        System.out.println("Here's your message three times bc why the f not");

        // printing message three times
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ": " + message);
        }

        storyExercise();
    }

    public static void storyExercise() {
        Scanner scanner = new Scanner(System.in);
        String name, job;

        System.out.println("I will tell you a story, but I need some information first");
        System.out.println("What is the main character called?");

        name = scanner.nextLine();

        System.out.println("What is their job?");

        job = scanner.nextLine();

        System.out.println("Here is the story: ");

        String story = """
        Once upon a time there was %1$s, who was a %2$s.
        On the way to work, %1$s reflected on life.
        Perhaps %1$s will not be a %2$s forever.
        """.formatted(name, job);

        System.out.println(story);

    }
}
