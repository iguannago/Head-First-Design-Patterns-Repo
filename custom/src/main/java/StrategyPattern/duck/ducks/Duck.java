package StrategyPattern.duck.ducks;

import StrategyPattern.duck.fly.FlyBehaviour;
import StrategyPattern.duck.quack.QuackBehaviour;

/**
 * Created by davicres on 05/04/2016.
 */
public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public abstract void display();
    public void swim() {
        System.out.println("all StrategyPattern.duck.ducks swim");
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
