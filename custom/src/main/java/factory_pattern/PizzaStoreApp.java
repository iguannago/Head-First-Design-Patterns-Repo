package factory_pattern;

public class PizzaStoreApp {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("CheesePizza");
        pizzaStore.orderPizza("VeggiePizza");
    }
}
