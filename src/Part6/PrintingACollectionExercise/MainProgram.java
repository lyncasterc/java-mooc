package Part6.PrintingACollectionExercise;

public class MainProgram {
    public static void main(String[] args) {
        SimpleCollection s = new SimpleCollection("characters");
        System.out.println(s);

        System.out.println();

        s.add("magneto");
        System.out.println(s);

        System.out.println();

        s.add("mystique");
        System.out.println(s);

        System.out.println();

        s.add("phoenix");
        System.out.println(s);

        System.out.println("Longest: " + s.longest());
    }
}
