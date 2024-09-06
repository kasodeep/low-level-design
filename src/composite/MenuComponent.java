package composite;

public abstract class MenuComponent {

    public abstract void add(MenuComponent menuComponent);

    public abstract void remove(MenuComponent menuComponent);

    public abstract MenuComponent getChild(int i);

    public abstract String getName();

    public abstract String getDescription();

    public abstract double getPrice();

    public abstract boolean isVegetarian();

    public abstract void print();
}
