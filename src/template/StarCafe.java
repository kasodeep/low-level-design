package template;

public class StarCafe {

    public static void main(String[] args) {
        CoffeeWithHook withHook = new CoffeeWithHook();
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        withHook.prepare();
        tea.prepare();
        coffee.prepare();
    }
}
