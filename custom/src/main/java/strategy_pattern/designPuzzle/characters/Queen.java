package strategy_pattern.designPuzzle.characters;

import strategy_pattern.designPuzzle.weapons.Knife;

/**
 * Created by davicres on 26/05/2016.
 */
public class Queen extends Character {

    public Queen() {
        setWeaponBehaviour(new Knife());
    }

    @Override
    void fight() {
        System.out.println("I'm the Queen and my weapon is: " + getWeaponBehaviour().useWeapon());
    }
}

