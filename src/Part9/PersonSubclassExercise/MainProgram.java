package Part9.PersonSubclassExercise;

public class MainProgram {
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);


        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.getCredits());
        ollie.study();
        System.out.println("Study credits "+ ollie.getCredits());


        /*
        * I am creating a reference variable
        * of type Person, which points to an object of type Student (which is a subclass).
        *
        * Person has its own toString, but so does Student. So if I call toString on the Person reference, which does it call?
        * */

        Person olliePerson = ollie;

        System.out.println("\n\n");

        //
        System.out.println(olliePerson.toString());


        Object ollieObject = ollie;

        System.out.println(ollieObject.toString());

        /*
        * It calls Student's toString.
        * The type of the OBJECT determines which method is called, not the type of the reference.
        *
        * this is called dynamic method dispatching
        *
        * Polymorphism - the Student object can be used via Student, Person or Object. it takes on many forms
        * */
    }
}
