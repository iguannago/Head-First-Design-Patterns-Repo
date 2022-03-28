package factory_pattern;

import java.util.List;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        super.name = "Veggie pizza";
        super.dough = "veggie";
        super.sauce = " veggie";
        super.toppings = List.of("Veggie toppings");
    }

}
