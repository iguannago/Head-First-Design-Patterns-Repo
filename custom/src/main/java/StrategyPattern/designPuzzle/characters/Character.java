package StrategyPattern.designPuzzle.characters;

import StrategyPattern.designPuzzle.weapons.WeaponBehaviour;

/**
 * Created by davicres on 26/05/2016.
 */
public abstract class Character {
    private WeaponBehaviour weaponBehaviour;

    abstract void fight();
    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
