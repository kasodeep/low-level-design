package iterator;

import iterator.hotel.DinnerMenu;
import iterator.hotel.Menu;
import iterator.hotel.PancakeHouseMenu;
import iterator.hotel.Waitress;

import java.util.ArrayList;

public class Hotel {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinnerMenu();

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
