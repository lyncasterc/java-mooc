package Part8.HashMap;

import Part4.Person;

import java.util.HashMap;
import java.util.Map;

public class MainProgram {
    public static void main(String[] args) {
        // HashMaps expect reference types only
        // Integer, String, etc.
        // values are auto-boxed
        HashMap<String, String> map =  new HashMap<>();
        map.put("Key", "Value");
        map.put("Key2", "Value2");
        map.put("Key3", "Value3");

        System.out.println(map);

        // getting value by key
        System.out.println(map.get("Key2"));

        // returns null if key not found

        System.out.println(map.get("boop")); // null


        // you cant have dup keys in the hashmap
        // it will just overwrite the previous value

        // changing key3's value to value4
        map.put("Key3", "Value4");

        System.out.println(map);

        System.out.println(map.get("Key3")); // Value4


        // Reference type as a HashMap value

        HashMap<String, Person> namePersonMap = new HashMap<>();

        Person somePerson = new Person("Steven", 25);

        namePersonMap.put(somePerson.getName(), somePerson);

        Person retrievedPerson = namePersonMap.get("Steven");

        // same object in memory
        System.out.println(retrievedPerson == somePerson);

        System.out.println(map.containsKey("Key"));


        // looping through a HashMap w/ forEach lambda
        System.out.println("Loop 1\n\n");

        map.forEach((key, value) -> {
            System.out.println(
                """
                    key: %s
                    value: %s
                """.formatted(key, value)
            );
        });

        System.out.println("Loop 2\n\n");

        // getting a set of the keys
        System.out.println(map.keySet());

        for (String key : map.keySet()) {
            String value = map.get(key);

            System.out.println(
                    """
                        key: %s
                        value: %s
                    """.formatted(key, value)
            );
        }


        System.out.println("Loop 3\n\n");

        for (Map.Entry<String, String> keyValueEntry : map.entrySet()) {
            String key = keyValueEntry.getKey();
            String value = keyValueEntry.getValue();

            System.out.println(
                    """
                        key: %s
                        value: %s
                    """.formatted(key, value)
            );
        }


        // getting hashmap values
//        System.out.println(map.values());


        //  in order to use object as key, it must have a hashCode method
        HashMap<Person, Integer> personSalary = new HashMap<>();
        personSalary.put(somePerson, 500_000);

        System.out.println(personSalary.get(somePerson));
    }
}
