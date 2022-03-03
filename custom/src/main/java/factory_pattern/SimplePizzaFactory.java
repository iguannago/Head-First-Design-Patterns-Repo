package factory_pattern;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if ("CheesePizza".equals(type)) {
            return new CheesePizza();
        }
        if ("VeggiePizza".equals(type)) {
            return new VeggiePizza();
        }
        throw new RuntimeException("Pizza type not found");
    }
}
