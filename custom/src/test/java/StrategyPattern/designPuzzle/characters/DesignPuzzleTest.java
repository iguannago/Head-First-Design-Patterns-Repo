package StrategyPattern.designPuzzle.characters;

import StrategyPattern.designPuzzle.weapons.BowAndArrow;
import org.junit.Test;

/**
 * Created by davicres on 26/05/2016.
 */
public class DesignPuzzleTest {

    @Test
    public void queenTest() {
        Character queen = new Queen();
        queen.fight();
        queen.setWeaponBehaviour(new BowAndArrow());
        queen.fight();
    }

    @Test
    public void kingTest() {
        Character king = new King();
        king.fight();
        king.setWeaponBehaviour(new BowAndArrow());
        king.fight();
    }
}
