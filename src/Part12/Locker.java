package Part12;

import java.util.ArrayList;

// generics allow for a freely chosen type at the object's creation
public class Locker<T> {
    ArrayList<T> elements;

    public Locker() {
        elements = new ArrayList<>();
    }

    public void printlnElements() {
        elements.forEach((element) -> System.out.println(element));
    }

    public void addElement(T element) {
        elements.add(element);
    }


}
