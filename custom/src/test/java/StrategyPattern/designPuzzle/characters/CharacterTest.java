package StrategyPattern.designPuzzle.characters;

import org.junit.Test;

/**
 * Created by davicres on 26/05/2016.
 */
public class CharacterTest {
    @Test
    public void characterObjectTest() {
        Character character = new Character() {
            @Override
            void fight() {
                ;
            }
        };
    }
}
