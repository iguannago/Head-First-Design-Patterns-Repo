package decorator_pattern.condiments;

import decorator_pattern.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String toString() {
        return "Mocha{" +
                "description='" + this.getDescription() + "'," +
                "cost='" + this.cost() + '\'' +
                '}';
    }
}
