package Part5;

import Part4.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class PrimitiveRefVariables {
    public static void main(String[] args) {
        int value = 10; // primitive, holds its value

        System.out.println(value); // 10

        Object obj = new Object(); // reference, holds a memory address

        // java.lang.Object@a09ee92
        // the above is only printed if the toString hasn't been overloaded
        System.out.println(obj);

        /*
        * Primitive variable types:
        *
        * - boolean
        * - byte: 1 byte containing 8 bits. values from -128 to 127
        * - char
        * - short: 2 bytes, values from -32,768 to 32,767
        * - int : 4 bytes, values from -2,147,483,648 to 2,147,483,647
        * - long: 8 bytes, values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        * - float: 4 bytes, values from 1.4e-45 to 3.4e+38
        * - double: 8 bytes, values from 4.9e-324 to 1.8e+308
        *
        * when a primitive variable is created, the computer reserves a memory space for it and stores the value in that space.
        *
        *  NOTE: java is pass by value, not pass by reference.
         * - passing a primitive variable to a method, the method receives a copy of the value of the variable.
         * - passing a reference variable to a method, the method receives a copy of the memory address of the object.
         *      - because reference variables store the memory address of an object, not the object itself.
        *
        * values of primitive variables are copied when they are assigned to another variable or passed as a parameter to a method.
        *
        * reference variables:
        * - store the memory address of an object.
        * - when you do something like Object obj = new Object();
        *     - the constructor creates a new object in memory and returns the memory address of that object.
        *
        * */


        // person1 and person2 are pointing to the same object in memory

        Person person1 = new Person("John", 25);
        Person person2 = person1;

        System.out.println(person1);
        System.out.println(person2);

        person2.growOlder(5);

        // both person1 and person2 grew older by 5 years
        // even though we only called growOlder on person2
        System.out.println(person1);
        System.out.println(person2);

        // now person2 is pointing to a new object in memory
        // person1 and person2 are no longer the same object
        person2 = new Person("Jane", 30);

        person2.growOlder(10);

        System.out.println(person1);
        System.out.println(person2);

        // person2 is now no longer pointing to an object in memory
        // the object person2 was pointing to before is garbage collected
        person2 = null;

        System.out.println(person2); // null

        try {
            person2.growOlder(5);
        } catch (NullPointerException e) {
            System.err.println(e);
        }


        System.out.println("\n\n");
        System.out.println(person1);

        growPersonOlder(person1, 5);
        System.out.println(person1);


//        System.out.println(LocalDate.now().getDayOfWeek());

        System.out.println(person1.olderThan(new Person("Jane", 50)));


        ArrayList<Person> persons = new ArrayList<>();

        persons.add(person1);


        person2 = new Person(person1.getName(), person1.getAge());


        // i've made person2 have the same state as person1
        person2.setHeight(person1.getHeight());
        person2.setWeight(person1.getWeight());

        System.out.println("Person1: " + person1);
        System.out.println("Person2: " + person2);


        // both return true
        // contains is using the .equals method in the Person class
        System.out.println(persons.contains(person2));
        System.out.println(persons.contains(person1));



    }

    public static void growPersonOlder(Person person, int years) {
        person.growOlder(years);
    }
}
