package template;

public abstract class CaffeineBeverage {

    final void prepare() {
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * The two methods need to be defined in the concrete class.
     */
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water!");
    }

    void pourInCup() {
        System.out.println("Pouring into cup!");
    }

    /**
     * The hook() method which can be hooked by subclasses.
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
