package strategy_pattern.duck.fly;

/**
 * Created by davicres on 26/05/2016.
 */
public class FlyRocketPowered implements FlyBehaviour {
    public void fly() {
        System.out.println("I'm flying with a Rocket.");
    }
}
