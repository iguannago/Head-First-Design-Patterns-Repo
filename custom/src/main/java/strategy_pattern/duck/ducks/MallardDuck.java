package strategy_pattern.duck.ducks;

/**
 * Created by davicres on 05/04/2016.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehaviour(() -> System.out.println("StrategyPattern.duck.fly with wings"));
        setQuackBehaviour(() -> System.out.println("StrategyPattern.duck.quack, StrategyPattern.duck.quack"));
    }

    @Override
    public void display() {
        System.out.println("This is a MallardDuck");
    }
}
