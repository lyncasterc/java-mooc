package Part11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        /*
        * Exceptions are Objects, they all extend Throwable
        *
        * Three cat. of exceptions:
        *
        * Checked:
        *   - exceptions that Java compiler requires us to handle
        *   - do not inherit from RuntimeException
        *   - must either throw the exception up the call stack or handle it (try-catch)
        *
        * Unchecked:
        *   - Java does not require us to handle.
        *   - checked at runtime, usually programming/logic errors.
        *
        * Errors:
        *   - serious and unrecoverable (mem leak, stack overflow, etc)
        *   - usually weird to handle, errors should usually be allowed to propagate up the call stack.
        * */



        // Scanner constructor throws checked exception (FileNotFoundException)
        // which means I can't do this, intellij gives me an error.
//        Scanner reader = new Scanner(new File("file.txt"))


        // try-with-resources exception handling

        // handles closing of resources (like opening files) to prevent mem leaks.

        // must implement the AutoCloseable or Closable interface

        try (Scanner reader = new Scanner(new File("file.txt"))) {
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file: " + e);
            e.printStackTrace();
        }


        printName("s");


        // writing to files:
        try (PrintWriter writer = new PrintWriter("file.txt")) {
            writer.println("Yeaaaahhhhhh!");
        } catch (FileNotFoundException e) {
            System.err.println();
        }
    }

    // re-throwing exception is one way of handing exceptions.
    // it shifts the responsibility of handling the exception to whoever will call it
    public static void readFile(String fileName) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("file.txt"));
        System.out.println("Boop!");
    }

    public static void printName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty");
        }

        System.out.println(name);
    }




}
