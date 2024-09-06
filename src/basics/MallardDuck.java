package basics;

import basics.fly.FlyWithWings;
import basics.quack.Quack;

public class MallardDuck extends Duck{

    /**
     We can also set the concrete classes dynamically using setters.<br>
     This implements the second Design Principle.
     * */
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
