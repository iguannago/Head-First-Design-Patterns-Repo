package StrategyPattern.duck.quack;

/**
 * Created by davicres on 26/05/2016.
 */
public class DuckCall implements QuackBehaviour {
    public void quack() {
        System.out.println("I'm a duck call");
    }
}
