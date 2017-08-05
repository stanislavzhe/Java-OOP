package com.stas.TextRPG;

/**
 * Created by stanislavz on 15-Jun-17.
 */
public class PlayerClass extends UnitClass {
    private int xp = 1;
    private int gold = 0;
    private int strength = 1;
    private int dexterity = 1;
    private int intelligence = 1;
    private Locations currentLocation = new Locations();

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void playerInfo(UnitClass player) {
        System.out.println(player.getName() + "\nLVL: " + player.getLvl() + "; XP: " + ((PlayerClass) player).getXp() +
                "\nHP: " + player.getCurrentHp() + "/" + player.getHp() +
                "\nDamage: 0-" + player.getDamage() + "\n");
    }

    public Locations getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Locations currentLocation) {
        this.currentLocation = currentLocation;
    }
}