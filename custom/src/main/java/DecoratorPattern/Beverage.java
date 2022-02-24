package DecoratorPattern;

public abstract class Beverage {
    public String description = "";

    public abstract int cost();

    public String getDescription() {
        return description;
    }

}
