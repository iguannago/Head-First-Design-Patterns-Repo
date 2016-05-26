package StrategyPattern.designPuzzle.characters;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by davicres on 26/05/2016.
 */
public class DesignPuzzleTest {
    @Test
    public void characterObjectTest() {
        Character character = new Character() {
            @Override
            void fight() {
                ;
            }
        };
        assertNotNull(character);
    }
    @Test
    public void queenTest() {
        Character queen = new Queen();
        queen.fight();
    }

    @Test
    public void kingTest() {
        Character king = new King();
        king.fight();
    }
}
