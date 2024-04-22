package Part10.Streams;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainProgram {
    public static void main(String[] args) {
        /*
         * Streams are a way of going through collection of data and performing operation on each value
         *
         * honestly it just sounds a lot like array methods/mapping in JS
         *
         * like for ex in js you can just call .filter on an array but in java I need to use streams
         * */

        ArrayList<Integer> nums = new ArrayList<>();

        try {
            Scanner file = new Scanner(Paths.get("src/Part4/numbers.txt"));

            while (file.hasNextLine()) {
                nums.add(Integer.valueOf(file.nextLine()));
            }
        } catch (Exception e) {
            System.err.println("Error reading file: " + e);
        }

        long numsGreaterThan100Count = nums.stream().filter(num -> num > 100).count();
        OptionalDouble avg = nums.stream().mapToInt(num -> Integer.valueOf(num)).average();

        if (avg.isPresent()) {
            System.out.println("avg: " + avg.getAsDouble());
        }

        System.out.println(numsGreaterThan100Count);

        ArrayList<Integer> numsGreaterThan100 = nums.stream()
            .filter(num -> num > 100)
            .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numsGreaterThan100);


//        numsGreaterThan100.forEach(num -> System.out.println(num));

        long uniqueNums = nums.stream().distinct().count();

        System.out.println("Unique numbers: " + uniqueNums);

    }


}
