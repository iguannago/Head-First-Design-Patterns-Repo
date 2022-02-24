package DecoratorPattern.beverages;

import DecoratorPattern.beverages.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super.description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 2.99;
    }

    @Override
    public String toString() {
        return "DarkRoast{" +
                "description='" + description + "'," +
                "cost='" + cost() + '\'' +
                '}';
    }
}
