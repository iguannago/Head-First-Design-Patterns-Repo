package decorator_pattern.beverages;

public class Espresso extends Beverage {

    public Espresso() {
        super.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "description='" + description + "'," +
                "cost='" + cost() + "'" +
                '}';
    }
}
