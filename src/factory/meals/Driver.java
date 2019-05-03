package factory.meals;

import factory.meals.american.AmericanMealFactory;
import factory.meals.german.GermanMealFactory;

public class Driver {

    public static void main(String[] args) {
        AmericanMealFactory mealFactory = new AmericanMealFactory();
        
        //GermanMealFactory mealFactory = new GermanMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
