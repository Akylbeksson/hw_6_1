package com.company;

public class Boss extends GameEntity {

    public Weapon weapon;

    public Boss() {
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {

        this.weapon = weapon;

    }


    public String printInfo() {
        Weapon weapon = new Weapon("Laser", "'Blaster'");
        setWeapon(weapon);

        setHealth(800);
        setDamage(50);

        return "Boss' health is " + getHealth() +
                ", his damage is " + getDamage() + "." + " "
                + "His weapon is " + getWeapon().getWeaponName() + ", "
                + getWeapon().getWeaponType() + " type.";
    }
}