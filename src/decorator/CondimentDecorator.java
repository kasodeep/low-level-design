package decorator;

/**
 * We extended the Beverage to be interchangeable and implement composition.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
