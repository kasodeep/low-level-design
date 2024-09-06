package template;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
