package basics;

import basics.fly.FlyWithWings;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        // Mallard Duck.
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println();

        // Model Duck.
        Duck model = new ModelDuck();
        model.display();
        model.swim();
        model.performFly();

        System.out.println("Setting new behavior");
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
