package Part9.PersonSubclassExercise;

public class Person {
    protected String name;
    protected String address;

    public Person(String address, String name) {
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
