package com.stas.TextRPG;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by stanislavz on 25-May-17.
 */

public class GameLauncher {
    public static void main(String[] args) {
        System.out.println("RGP text game\nSTART\n");

        PlayerClass player = GameCommands.playerCreate();

        Scanner scanner = new Scanner(System.in);
        String playerComand = "";

        while (!Objects.equals(playerComand, "q")) {
            System.out.print("Enter comamnd: ");
            playerComand = scanner.nextLine();



            //f - player fight
            if (Objects.equals(playerComand, "f")) {
                playerComand = GameCommands.fight(player, GameCommands.monsterCreate());
            }

            //i - player info
            if (Objects.equals(playerComand, "i")) {
                player.playerInfo(player);
                continue;
            }

            //l - player location
            if (Objects.equals(playerComand, "l")) {
                System.out.println("current location: " + player.getCurrentLocation().getType());
                continue;
            }

            //lv - change location to village
            if (Objects.equals(playerComand, "lv")) {
                continue;
            }

            //ld - change location to dungeon
            if (Objects.equals(playerComand, "ld")) {
                continue;
            }

            //h- heal player
            if (Objects.equals(playerComand, "h")) {
                player.getCurrentLocation().healPlayer(player);
                continue;
            }

            //fight in village
            if (Objects.equals(playerComand, "fv")) {
                player.getCurrentLocation().fightInVillage(player);
                continue;
            }

            //q - quit
            if (!Objects.equals(playerComand, "q")) {
                System.out.println("One more time?!");
            }
        }
        System.out.println("End of Game");
    }

}
