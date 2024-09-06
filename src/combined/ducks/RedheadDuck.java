package combined.ducks;

import combined.Quackable;

public class RedheadDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
