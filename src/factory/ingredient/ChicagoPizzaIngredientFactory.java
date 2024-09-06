package factory.ingredient;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.cheese.MozzarellaCheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.clams.FrozenClams;
import factory.ingredient.dough.Dough;
import factory.ingredient.dough.ThickCrustDough;
import factory.ingredient.pepperoni.Pepperoni;
import factory.ingredient.pepperoni.SlicedPepperoni;
import factory.ingredient.sauce.PlumTomatoSauce;
import factory.ingredient.sauce.Sauce;
import factory.ingredient.veggies.BlackOlives;
import factory.ingredient.veggies.EggPlant;
import factory.ingredient.veggies.Spinach;
import factory.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new EggPlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
