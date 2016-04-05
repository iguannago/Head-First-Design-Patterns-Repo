package ducks;

import org.junit.Test;

/**
 * Created by davicres on 05/04/2016.
 */
public class DuckTest {
    @Test
    public void mallardDuckCanQuackAndFly() {
        Duck duck = new MallardDuck();
        duck.display();
        duck.fly();
        duck.quack();
        duck.swim();
    }
}
