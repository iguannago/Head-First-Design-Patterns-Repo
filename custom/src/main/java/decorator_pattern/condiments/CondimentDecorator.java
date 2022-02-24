package decorator_pattern.condiments;

import decorator_pattern.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public double cost() {
        return 0;
    }
}
