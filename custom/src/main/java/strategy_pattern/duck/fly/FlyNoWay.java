package strategy_pattern.duck.fly;

/**
 * Created by davicres on 05/04/2016.
 */
public class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("I don't StrategyPattern.duck.fly");
    }
}
