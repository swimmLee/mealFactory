package factory.meals.american;

import factory.meals.Meal;

public class Breakfast implements Meal {

    private String description;
    private int calories;

    public Breakfast() {
        description = "American Classic Hand and Eggs with Potatos";
        calories = 1355;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + calories + " calories.");
    }
}
