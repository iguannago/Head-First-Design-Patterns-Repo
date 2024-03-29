package strategy_pattern.designPuzzle.characters;

import strategy_pattern.designPuzzle.weapons.Knife;

/**
 * Created by davicres on 26/05/2016.
 */
public class King extends Character {
    public King() {
        setWeaponBehaviour(new Knife());
    }

    @Override
    void fight() {
        System.out.println("I'm the King and my weapon is: " + getWeaponBehaviour().useWeapon());
    }
}
