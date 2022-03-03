package factory_pattern;

import java.util.Optional;

public class SimplePizzaFactory {
    public Optional<Pizza> createPizza(String type) {
        if ("CheesePizza".equals(type)) {
            return Optional.of(new CheesePizza());
        }
        if ("VeggiePizza".equals(type)) {
            return Optional.of(new VeggiePizza());
        }
        return Optional.empty();
    }
}
