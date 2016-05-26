package StrategyPattern.designPuzzle.characters;

/**
 * Created by davicres on 26/05/2016.
 */
public class Queen extends Character {
    @Override
    void fight() {
        System.out.println("I'm the Queen and my weapon is: " + getWeaponBehaviour().useWeapon());
    }
}

