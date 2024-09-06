package combined.factory;

import combined.Quackable;
import combined.decorator.QuackCounter;
import combined.ducks.DuckCall;
import combined.ducks.MallardDuck;
import combined.ducks.RedheadDuck;
import combined.ducks.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
