package factory_pattern;

import java.util.List;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        super.name = "Cheese pizza";
        super.dough = "cheese";
        super.sauce = "cheese";
        super.toppings = List.of("Cheese toppings");
    }
}
