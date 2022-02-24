package decorator_pattern.condiments;

import decorator_pattern.beverages.Beverage;

public class Milk extends CondimentDecorator {
    private final Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .35;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "description='" + this.getDescription() + "'," +
                "cost='" + this.cost() + '\'' +
                '}';
    }
}
