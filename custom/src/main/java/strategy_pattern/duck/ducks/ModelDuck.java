package strategy_pattern.duck.ducks;

import strategy_pattern.duck.fly.FlyNoWay;
import strategy_pattern.duck.quack.Quack;

/**
 * Created by davicres on 26/05/2016.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
