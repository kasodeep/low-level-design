package combined.decorator;

import combined.Quackable;

public class QuackCounter implements Quackable {

    static int numberOfQuacks;

    Quackable duck;

    public QuackCounter(Quackable quackable) {
        this.duck = quackable;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
}
