package com.stas.TextRPG;

/**
 * Created by stanislavz on 01-Jun-17.
 */

public class UnitClass {
    private String name;
    private int hp;
    private int currentHp;
    private int damage;
    private int lvl = 1;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void unitInfo(UnitClass unit) {
        System.out.println(unit.getName() + "\nHP: " + unit.getCurrentHp() + "/" + unit.getHp() + "\n");
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }
}
