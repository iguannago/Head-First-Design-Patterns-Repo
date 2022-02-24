package DecoratorPattern;

public class Decaf extends Beverage {

    String description = "Decaf";

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
