package Part10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MainProgram {
    public static void main(String[] args) {
        // other techniques
        // string concatenation creates new string each time, not super fast.


        // one string obj
        String name = "";

        name += "Steven"; // new string

        name += " Cabrera"; // new string


        // using StringBuilder provides way to concatenate w/o creating new string each time


        StringBuilder name2 = new StringBuilder();

        name2.append("Steven");
        name2.append(" ");
        name2.append("Cabrera");

        name = name2.toString();

        System.out.println(name);
        System.out.println(name2);


        DaysOfWeek firstDay = DaysOfWeek.MONDAY;

        System.out.println(firstDay);
        System.out.println(firstDay == DaysOfWeek.MONDAY);

        // .values() returns an array the values
        for (DaysOfWeek value : DaysOfWeek.values()) {
            System.out.println(value);
            System.out.println("abbr: " + value.getAbbr());
        }


        for (Color value : Color.values()) {
            System.out.println(value.getCode());
            System.out.println(value.getNumber());
        }

        // iterators are useful for changing the collection as you iterate through it.
        // you can use iterator for removing an element as you loop through it.


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Iterator<Integer> numsIt = nums.iterator();

        System.out.println("\n\n");
        System.out.println(numsIt);
//        System.out.println(numsIt.next()); // 1


        System.out.println("\n\n");


        numsIt.forEachRemaining((num) -> System.out.println(num));


        System.out.println("While loop: ");
        while (numsIt.hasNext()) {

            // it seems that .next() also moves the iterator forward one
            System.out.println(numsIt.next());
        }


        // once you've looped through the collection using Iterator,
        // you have to get a new one if you want to  do another loop

        numsIt = nums.iterator();

        while (numsIt.hasNext()) {
            if (numsIt.next() == 3) {
                numsIt.remove();
                System.out.println("Removed the number 3");
            }
        }

        System.out.println(nums);
    }
}
