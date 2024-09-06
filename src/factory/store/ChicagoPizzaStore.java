package factory.store;

import factory.ingredient.ChicagoPizzaIngredientFactory;
import factory.ingredient.PizzaIngredientFactory;
import factory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
            }
        }
        return pizza;
    }
}
