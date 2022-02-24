package DecoratorPattern;

public class Espresso extends Beverage {

    String description = "Espresson";

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
