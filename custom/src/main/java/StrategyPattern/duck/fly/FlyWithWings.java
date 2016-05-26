package StrategyPattern.duck.fly;

/**
 * Created by davicres on 05/04/2016.
 */
public class FlyWithWings implements FlyBehaviour{
    public void fly() {
        System.out.println("StrategyPattern.duck.fly with wings");
    }
}
