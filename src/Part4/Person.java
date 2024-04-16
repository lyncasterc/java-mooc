package Part4;

import java.util.Objects;

public class Person {

    private String name;

    public int getAge() {
        return age;
    }

    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this(name, 0); // calling a different constructor
    }

    // constructor overloading
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public void growOlder(int years) {
        this.age += years;
    }

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public boolean olderThan(Person otherPerson) {
        return this.age > otherPerson.age;
    }

    public boolean equals(Object compared) {

        // checking reference equality
        // if both reference same object in memory then they are equal
        if (this == compared) {
            return true;
        }

        // if they are not the same object in memory
        // and compared is not the same type, they are not equal
        if (!(compared instanceof Person)) {
            return false;
        }

        /*
         * if we're down here, we know that:
         * - they are not the same object in memory
         * - they are both the same type (Person)
         *
         * so now we need to manually check values.
         *
         * (keep in mind that this doesn't make sense because two different people can have the same name, age, height, etc.).
        */


        /*
        *
         * keep in mind that custom objects in java implicitly
         * inherit Object.
         *
         * so a Person is also an Object.
        * */
        Person comparedPerson = (Person) compared;

        if (
            this.name.equals(comparedPerson.name) &&
            this.weight == comparedPerson.weight &&
            this.height == comparedPerson.height
        ) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight);

    }
}