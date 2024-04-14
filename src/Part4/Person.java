package Part4;

public class Person {

    // instance variables
    private String name;

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;

    private int age;
    private static int count = 0;

    // constructor
    // if no constructor is made, a default one is created by java
    public Person(String name) {
        this.age = 0;
        this.name = name;
        count++;
    }

    public int getAge() {
        return age;
    }

//    public void printPerson() {
//        System.out.println(this.name);
//        System.out.println("-------------");
//        System.out.println("age: " + this.age);
//    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
}
