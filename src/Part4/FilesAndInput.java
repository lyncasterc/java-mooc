package Part4;

import java.nio.file.Paths;
import java.util.Scanner;

public class FilesAndInput {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(Paths.get("src/Part4/file.txt"));

            while (file.hasNextLine()) {

                String line = file.nextLine();
                System.out.println(line);

                System.out.println(line.contains("file"));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        numbersFromAFileEx();

        // checking if string is emply
        String empty = "";

        System.out.println(empty.isEmpty()); //  true
    }

    public static void numbersFromAFileEx() {
        int numberCount = 0, min = 0, max = 0;

        try {
            Scanner file = new Scanner(Paths.get("src/Part4/numbers.txt"));

            while (file.hasNextLine()) {
                int number = Integer.valueOf(file.nextLine());

                if (numberCount == 0) {
                    max = min = number;
                } else {
                    max = Math.max(max, number);
                    min = Math.min(min, number);
                }

                numberCount++;
            }

            System.out.println(
                """
                    Min: %d
                    Max: %d
                    Numbers: %d
                """.formatted(min, max, numberCount)
            );

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


    }
}
