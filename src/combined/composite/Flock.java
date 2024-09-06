package combined.composite;

import combined.Quackable;

import java.util.ArrayList;

public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quackable : quackers) {
            quackable.quack();
        }
    }
}
