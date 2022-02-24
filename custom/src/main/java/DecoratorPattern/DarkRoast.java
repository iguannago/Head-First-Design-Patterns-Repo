package DecoratorPattern;

public class DarkRoast extends Beverage {

    public String description = "DarkRoast";

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
