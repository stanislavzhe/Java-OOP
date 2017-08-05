package com.stas.TextRPG;

import java.util.Objects;

/**
 * Created by stanislavz on 21-Jun-17.
 */
public class Locations {
    private String type = "Road";

    public void healPlayer(PlayerClass player) {
        if (Objects.equals(player.getCurrentLocation().getType(),"Village")) {
            player.setCurrentHp(player.getHp());
            System.out.println("HP recovered");
            player.unitInfo(player);
        }
        else {
            System.out.println("Not here");
        }
    }

    public void fightInVillage(PlayerClass player) {
        if (Objects.equals(player.getCurrentLocation().getType(),"Village")) {

            System.out.println("No fights in Village");
        }
        else {
            //GameCommands.fight(PlayerClass player, UnitClass monster);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
