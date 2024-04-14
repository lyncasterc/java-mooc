package Part4;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroToOOP {
    public static void main(String[] args) {
        Account account = new Account("Steven", 10_000_000);
        account.deposit(34_000);

        System.out.println(account);

        Person person1 = new Person("Steven");

        // if the object has a toString method,
        // sout will call it.
        // this is the same:
        // System.out.println(person1.toString());
        System.out.println(person1);

        System.out.println("Num of persons: " + Person.getCount());

        person1.growOlder();
        person1.growOlder();

        System.out.println(person1.toString());

        System.out.println("is person1 legal: " + person1.isOfLegalAge());
//        gaugeEx();

        ArrayList<Person> persons = new ArrayList<>(Arrays.asList(person1));

        System.out.println("first person: " + persons.getFirst());

        ArrayList<Person> youngerPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() < 2) {
                youngerPersons.add(person);
            }
        }


    }


    public static void gaugeEx() {
        Gauge g = new Gauge();

        while (!g.isFull()) {
            System.out.println("Not full! Value: " + g.getValue());
            g.increase();
        }

        System.out.println("Full! Value: " + g.getValue());
        g.decrease();
        System.out.println("Not full! Value: " + g.getValue());

    }
}
