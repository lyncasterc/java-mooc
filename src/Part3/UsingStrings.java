package Part3;

import java.util.Arrays;

public class UsingStrings {
    public static void main(String[] args) {
        // splitting strings
        String fullName = "Steven Cab";
        String[] firstAndLastNameArr = fullName.split(" ");
        String firstName = firstAndLastNameArr[0];
        String lastName = firstAndLastNameArr[1];

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName.contains("ven")); // true

        // getting character at specified index
        System.out.println(fullName.charAt(0)); // S

        // length of string
        System.out.println(fullName.length());
    }
}
