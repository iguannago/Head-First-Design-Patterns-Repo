package DecoratorPattern.beverages;

import DecoratorPattern.beverages.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.description = "House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }

    @Override
    public String toString() {
        return "HouseBlend{" +
                "description='" + description + "'," +
                "cost='" + cost() + '\'' +
                '}';
    }
}
