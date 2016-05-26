package StrategyPattern.duck.quack;

/**
 * Created by davicres on 05/04/2016.
 */
public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<< silence >>");
    }
}
