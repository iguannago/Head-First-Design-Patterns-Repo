package decorator_pattern.beverages;

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
