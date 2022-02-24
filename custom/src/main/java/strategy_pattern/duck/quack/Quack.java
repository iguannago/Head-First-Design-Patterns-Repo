package strategy_pattern.duck.quack;

/**
 * Created by davicres on 05/04/2016.
 */
public class Quack implements QuackBehaviour {
    public void quack() {
        System.out.println("StrategyPattern.duck.quack, StrategyPattern.duck.quack");
    }
}
