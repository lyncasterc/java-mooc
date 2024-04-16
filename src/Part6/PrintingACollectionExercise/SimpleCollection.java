package Part6.PrintingACollectionExercise;

import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String longest = this.elements.getFirst();

        for (String element : this.elements) {
            longest = (longest.length() > element.length()) ? longest : element;
        }

        return longest;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty";
        }

        String message = "The collection has " + this.elements.size();

        for (String element : this.elements) {
            message += "\n " + element;
        }

        return message;
    }
}