package strategy_pattern.duck.ducks;

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
        modelDuck.setFlyBehaviour(() -> System.out.println("I'm flying with a Rocket."));
        modelDuck.fly();
    }
}
