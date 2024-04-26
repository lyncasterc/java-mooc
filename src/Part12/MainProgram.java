package Part12;

import java.util.Random;

public class MainProgram {
    public static void main(String[] args) {
        // creating an Integer locker by passing in the type arg
        Locker<Integer> locker = new Locker<>();

        locker.addElement(1);
        locker.addElement(2);
        locker.addElement(3);
        locker.addElement(4);

        locker.printlnElements();


        // Randomness

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println("Random int 0 - 5: " + random.nextInt(6));
        }

        // multi-dimensional arrays

        int[][] arr = new int[2][2];

        int[][] arr2 = {{1, 2}, {3, 4}};


    }
}
