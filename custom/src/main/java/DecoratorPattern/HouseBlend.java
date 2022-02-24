package DecoratorPattern;

public class HouseBlend extends Beverage {

    String description = "HouseBlend";

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
