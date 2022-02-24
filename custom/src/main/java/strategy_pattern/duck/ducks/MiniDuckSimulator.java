package strategy_pattern.duck.ducks;

import strategy_pattern.duck.fly.FlyRocketPowered;

/**
 * Created by davicres on 05/04/2016.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        System.out.println("mallarDuck:");
        mallardDuck.fly();
        mallardDuck.quack();

        Duck modelDuck = new ModelDuck();
        System.out.println("modelDuck:");
        modelDuck.fly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.fly();
    }
}
