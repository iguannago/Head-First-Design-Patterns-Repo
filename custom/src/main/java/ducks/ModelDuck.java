package ducks;

import fly.FlyNoWay;
import quack.Quack;

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
