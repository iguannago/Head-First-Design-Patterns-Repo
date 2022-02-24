package DecoratorPattern;

import java.util.List;

public class CoffeeShopApp {
    public static void main(String[] args) {
        Beverage coffee = new DarkRoast();
        Beverage decaf = new Decaf();
        Beverage espresso = new Espresso();
        Beverage houseBlend = new HouseBlend();

        System.out.println(List.of(coffee.getDescription(),
                decaf.getDescription(),
                espresso.getDescription(),
                houseBlend.getDescription()));
    }
}
