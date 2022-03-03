package factory_pattern;

import java.util.Optional;

public class PizzaStore {
    private final SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public void orderPizza(String type) {
        Optional<Pizza> maybePizza = simplePizzaFactory.createPizza(type);
        if (maybePizza.isPresent()) {
            Pizza pizza = maybePizza.get();
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            throw new RuntimeException("Pizza type not found");
        }
    }

}
