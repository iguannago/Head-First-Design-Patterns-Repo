package ducks;

import fly.FlyWithWings;
import quack.Quack;

/**
 * Created by davicres on 05/04/2016.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("This is a MallardDuck");
    }
}
