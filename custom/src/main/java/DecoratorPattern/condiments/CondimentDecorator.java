package DecoratorPattern.condiments;

import DecoratorPattern.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public double cost() {
        return 0;
    }
}
