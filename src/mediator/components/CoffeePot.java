package mediator.components;

import mediator.SmartHomeMediator;

public class CoffeePot extends Component {

    public CoffeePot(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void trigger(String event) {
        if (event.equals("BrewCoffee")) {
            System.out.println("[CoffeePot] Brewing coffee...");
            mediator.notify("CoffeeReady", this);
        }
    }
}
