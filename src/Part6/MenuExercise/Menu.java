package Part6.MenuExercise;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) throws IllegalArgumentException {
        if (meal.isEmpty()) {
            throw new IllegalArgumentException("Meal cannot be empty");
        }

        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }

}