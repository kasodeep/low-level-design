package factory.ingredient;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.dough.Dough;
import factory.ingredient.pepperoni.Pepperoni;
import factory.ingredient.sauce.Sauce;
import factory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
