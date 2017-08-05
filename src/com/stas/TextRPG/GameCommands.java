package com.stas.TextRPG;

import java.util.Scanner;

/**
 * Created by stanislavz on 01-Jun-17.
 */

public class GameCommands {

    public static PlayerClass playerCreate() {
        PlayerClass player = new PlayerClass();
        player.setHp(10 * player.getLvl() + 5 * player.getStrength());
        player.setCurrentHp(player.getHp());
        player.setDamage(1 * player.getLvl() + 1 * player.getStrength());
        player.setName("New player");

        //player.setAttachmentName(givePlayerName());
        //player.unitInfo(player);

        setPlayerLocationTypeVillage(player);
        System.out.println("Now you in " + player.getCurrentLocation().getType());

        return player;
    }

    public static String givePlayerName() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player name: ");
        name = scanner.nextLine();
        return name;
    }

    public static UnitClass monsterCreate() {
        UnitClass monster = new UnitClass();
        monster.setHp(5 * monster.getLvl());
        monster.setCurrentHp(monster.getHp());
        monster.setDamage(1 * monster.getLvl());
        monster.setName("Goblin");
        System.out.println("Monster saw you");
        monster.unitInfo(monster);

        return monster;
    }

    public static void attack(UnitClass defender, UnitClass attacker) {
        int hit = ((int) (Math.random() * 2) * attacker.getDamage());
        System.out.println(defender.getName() + " was damaged by " + hit);
        defender.setCurrentHp(defender.getCurrentHp() - hit);
        defender.unitInfo(defender);
    }

    public static String fight(PlayerClass player, UnitClass monster) {
        while (monster.getCurrentHp() > 0) {
            GameCommands.attack(player, monster);
            if (player.getCurrentHp() <= 0) {
                System.out.println("You DEAD");
                return "q";
            }

            GameCommands.attack(monster, player);
            if (monster.getCurrentHp() <= 0) {
                System.out.println("You kill " + monster.getName());
                System.out.println("+ " + 1 + " exp");
                player.setXp(player.getXp() + 1);
                break;
            }
        }
        return "";
    }

    public static void setPlayerLocationTypeVillage(PlayerClass player) {
        player.getCurrentLocation().setType("Village");
    }
}
