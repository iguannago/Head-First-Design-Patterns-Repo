package decorator_pattern;

import decorator_pattern.beverages.*;
import decorator_pattern.condiments.Milk;
import decorator_pattern.condiments.Mocha;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CoffeeShopApp {
    private static final Logger logger = Logger.getLogger(String.valueOf(CoffeeShopApp.class));

    public static void main(String[] args) {

        Beverage coffee = new DarkRoast();
        Beverage decaf = new Decaf();
        Beverage espresso = new Espresso();
        Beverage houseBlend = new HouseBlend();
        logger.log(Level.INFO, "{0}", List.of(coffee, decaf, espresso, houseBlend));

        coffee = new Mocha(coffee);
        logger.log(Level.INFO, "{0}", List.of(coffee, decaf, espresso, houseBlend));

        coffee = new Mocha(coffee);
        logger.log(Level.INFO, "{0}", List.of(coffee, decaf, espresso, houseBlend));

        espresso = new Milk(espresso);
        espresso = new Mocha(espresso);
        logger.log(Level.INFO, "{0}", List.of(coffee, decaf, espresso, houseBlend));
    }
}
