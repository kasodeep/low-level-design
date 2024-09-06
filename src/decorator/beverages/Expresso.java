package decorator.beverages;

import decorator.Beverage;

public class Expresso extends Beverage {

    public Expresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
