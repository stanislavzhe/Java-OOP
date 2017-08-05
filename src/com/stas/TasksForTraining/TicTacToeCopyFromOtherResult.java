package com.stas.TasksForTraining;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by stanislavz on 31-Mar-17.
 */
public class TicTacToeCopyFromOtherResult {
    private static final int SIZE =4;
    private static int[][] array;
    private static int[] compArray;
    private static int[] playerArray;
    private static ArrayList corners;
    private static Random randomGenerator;

    public static void main(String[] args) {


        array = new int[SIZE][SIZE];
        compArray = new int[SIZE*SIZE];
        playerArray = new int[SIZE*SIZE];
        String space = " ";
        addCorners();

        randomGenerator = new Random();

        Scanner sc = new Scanner(System.in);
        int player = 1;

        int quantityMove = 1;
        int move = 0;


        makeMove(player, 4);
        player = 2;

        while (quantityMove < SIZE * SIZE) {

            move = getMove(sc, player, move);
            makeMove(player, move);
            computerMove();
            player = 2;
            quantityMove += 2;
        }
        System.out.println("Standoff. You are not capable to win!!!");
    }

    private static void addCorners() {
        corners = new ArrayList();
        corners.add(1);
        corners.add(SIZE);
        corners.add(SIZE*(SIZE-1)+1);
        corners.add(SIZE*SIZE);
    }

    private static void recordMove(int a[], int move) {
        a[move] = 1;
    }

    private static void computerMove() {
        checkLastMove(playerArray, compArray);
        boolean wasMove = checkLastMove(compArray, playerArray);
        if (wasMove) {
            return;
        }
        if (corners.size() > 2) {
            int move = generateMove(corners);
            System.out.println("Computer move " + move);
            makeMove(1, move - 1);
            return;
        }
        makeNotLastMove(playerArray, compArray);


    }

    private static void makeNotLastMove(int[] a1, int[] a2) {

        boolean wasMove;
        for (int i = 0; i < 3; i++) {

            wasMove = makeNewMove(1 + SIZE * i, 2 + SIZE * i, 3 + SIZE * i, a1, a2);

            if (wasMove) {
                return;
            }
        }
        for (int i = 0; i < 3; i++) {
            wasMove =makeNewMove(1 + i, 4 + i, 7 + i, a1, a2);
            if (wasMove) {
                return;
            }
        }
    }

    private static boolean makeNewMove(int i1, int i2, int i3, int[] a1, int[] a2) {


        if (getValueArray(a1, i1, i2, i3) == 0) {

            if (getValueArray(a2, i1, i2, i3) == 1) {
                int move = getMoveFromArray(a2, i1, i2, i3);
                System.out.println("Computer move " + (move + 1));
                makeMove(1, move);
                return true;
            }
        }
        return false;

    }



    private static boolean checkLastMove(int[] a1, int[] a2) {
        boolean wasMove;
        for (int i = 0; i < 3; i++) {

            wasMove = makeLastMove(1 + SIZE * i, 2 + SIZE * i, 3 + SIZE * i, a1, a2);
            if (wasMove) {
                return wasMove;
            }
        }

        for (int i = 0; i < 3; i++) {

            wasMove = makeLastMove(1 + i, 4 + i, 7 + i, a1, a2);
            if (wasMove) {
                return wasMove;
            }
        }

        wasMove = makeLastMove(1, 5, 9, a1, a2);
        if (wasMove) {
            return wasMove;
        }

        wasMove = makeLastMove(3, 5, 7, a1, a2);
        return wasMove;
    }


    private static boolean makeLastMove(int i1, int i2, int i3, int[] a1, int[] a2) {


        if (getValueArray(a1, i1, i2, i3) == 0) {

            if (getValueArray(a2, i1, i2, i3) == 2) {

                int move = getMoveFromArray(a2, i1, i2, i3);
                System.out.println("Computer move " + (move + 1));
                makeMove(1, move);
                return true;

            }
        }
        return false;
    }

    private static int getMoveFromArray(int[] a, int i1, int i2, int i3) {

        if (a[i1 - 1] == 0) {
            return i1 - 1;
        } else if (a[i2 - 1] == 0) {

            return i2 - 1;
        }
        return i3 - 1;
    }

    private static int getValueArray(int[] a, int i1, int i2, int i3) {
        return a[i1 - 1] + a[i2 - 1] + a[i3 - 1];
    }


    private static int generateMove(ArrayList list) {
        int randomInt = randomGenerator.nextInt(list.size());
        return (int) list.get(randomInt);
    }


    private static void checkWinner(int player) {

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == player) {
                    count++;

                }
                getWinner(count);

            }

        }

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[0].length; j++) {
                if (array[j][i] == player) {
                    count++;
                }
                getWinner(count);
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {


            if (array[i][i] == player) {
                count++;

            }
            getWinner(count);

        }

        count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                if (j + i != SIZE - 1) {
                    continue;
                }

                if (array[i][j] == player) {
                    count++;

                }

                getWinner(count);

            }
        }

    }

    private static void getWinner(int count) {
        if (count == SIZE) {
            System.out.println("Computer is the winner one more time!!!You are LOOSER!!!");
            System.exit(0);
        }
    }

    private static int getMove(Scanner sc, int player, int move) {
        boolean correctMove = false;
        while (!correctMove) {
            System.out.println("Write your move Player " + player);
            if (sc.hasNextInt()) {
                move = sc.nextInt() - 1;
                if (move > SIZE * SIZE || move < 0) {
                    System.out.println("Ход вне диапазона от 1 до " + SIZE * SIZE);


                } else if (!isEmpty(move)) {
                    System.out.println("Ячейка " + (move + 1) + " занята. Сделайте правильный ход");
                } else {
                    correctMove = true;
                }

            } else {

                char ch = sc.next().charAt(0);
                //завершение программы при нажании клавиши q
                if (ch == 'q') {
                    System.exit(0);
                }
                System.out.println("Ввели не верное значение");

            }

        }
        return move;
    }

    private static void makeMove(int player, int move) {
        if (corners.contains(move + 1)) {
            corners.remove(corners.indexOf(move + 1));

        }
        if (player == 1) {
            recordMove(compArray, move);
        } else {
            recordMove(playerArray, move);

        }
        array[getRow(move)][getCol(move)] = whoMove(player);
        matrixPrinter();
        checkWinner(player);
    }

    private static int whoMove(int player) {
        return player == 1 ? 1 : 2;
    }

    private static boolean isEmpty(int move) {
        return getValue(move) == 0;
    }

    private static int getValue(int move) {
        return array[getRow(move)][getCol(move)];
    }

    private static int getCol(int move) {
        return move % SIZE;
    }

    private static int getRow(int move) {
        return move / SIZE;
    }

    private static void matrixPrinter() {
        int filing = 0;
        linePrinter();
        for (int i = 0; i < SIZE; i++) {

            separatorPrinter(filing, i);
            filing += SIZE;

        }
    }

    private static void separatorPrinter(int filing, int i) {
        for (int j = 0; j < SIZE; j++) {
            filing += 1;

            System.out.print("| ");


            if (array[i][j] == 1) {
                System.out.print("X ");

            } else if (array[i][j] == 2) {
                System.out.print("O ");
            } else {
                if (filing / 10 < 1) {
                    System.out.print(" ");
                }
                System.out.print(filing);
            }
        }
        System.out.print("|\n");
        linePrinter();
    }

    private static void linePrinter() {
        for (int k = 0; k < SIZE; k++) {
            System.out.print("----");
        }
        System.out.print("-\n");
    }
}
