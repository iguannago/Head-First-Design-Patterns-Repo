package DecoratorPattern;

import DecoratorPattern.beverages.*;
import DecoratorPattern.condiments.Milk;
import DecoratorPattern.condiments.Mocha;

import java.util.List;

public class CoffeeShopApp {
    public static void main(String[] args) {
        Beverage coffee = new DarkRoast();
        Beverage decaf = new Decaf();
        Beverage espresso = new Espresso();
        Beverage houseBlend = new HouseBlend();
        System.out.println(List.of(coffee, decaf, espresso, houseBlend));

        coffee = new Mocha(coffee);
        System.out.println(List.of(coffee, decaf, espresso, houseBlend));

        coffee = new Mocha(coffee);
        System.out.println(List.of(coffee, decaf, espresso, houseBlend));

        espresso = new Milk(espresso);
        espresso = new Mocha(espresso);
        System.out.println(List.of(coffee, decaf, espresso, houseBlend));
    }
}
