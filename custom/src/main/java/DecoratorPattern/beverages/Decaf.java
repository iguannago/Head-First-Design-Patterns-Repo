package DecoratorPattern.beverages;

import DecoratorPattern.beverages.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        super.description = "Decaf";
    }

    @Override
    public double cost() {
        return .55;
    }

    @Override
    public String toString() {
        return "Decaf{" +
                "description='" + description + "'," +
                "cost='" + cost() + '\'' +
                '}';
    }
}
