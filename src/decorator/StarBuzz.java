package decorator;

import decorator.beverages.DarkRoast;
import decorator.beverages.Expresso;
import decorator.beverages.HouseBlend;
import decorator.condiments.Mocha;
import decorator.condiments.Soy;
import decorator.condiments.Whip;

public class StarBuzz {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();

        // an espresso with no condiments.
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // a dark roast with double mocha and whip.
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);

        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        // a house blend with soy.
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);

        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
