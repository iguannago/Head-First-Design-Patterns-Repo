package ducks;

/**
 * Created by davicres on 05/04/2016.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();
    }
}
