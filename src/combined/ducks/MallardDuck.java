package combined.ducks;

import combined.Quackable;

public class MallardDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
