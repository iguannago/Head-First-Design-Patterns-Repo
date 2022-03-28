package factory_pattern;

import java.util.List;
import java.util.Optional;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings;

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        if (Optional.ofNullable(toppings).isPresent()) {
            toppings.forEach((t) -> System.out.println("toppings " + t));
        } else {
            System.out.println("with no toppings");
        }
    }

    void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

}
