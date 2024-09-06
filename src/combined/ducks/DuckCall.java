package combined.ducks;

import combined.Quackable;

public class DuckCall implements Quackable {

    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
