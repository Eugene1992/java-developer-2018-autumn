package java_starter.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    /*public static void main(String[] args) {
        int tableWidth = 3;
        int tableHeight = 3;
        int unitCount = 2;

        int[][] playerTable = new int[tableWidth][tableHeight];
        int[][] compTable = new int[tableWidth][tableHeight];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0, j = 0; i < unitCount; i++, j++) {
            System.out.println("Please, enter coordinates of unit " + ++j + ":");
            System.out.println("x = ");
            int playerUnitX = scanner.nextInt();
            System.out.println("y = ");
            int playerUnitY = scanner.nextInt();
            playerTable[playerUnitY][playerUnitX] = 1;
        }

        for (int i = 0; i < unitCount; i++) {
//          value from 1 to 50 in case of int or 0.0 (inclusive) to 50.0 (exclusive)
            int randCompUnitX = (int )(Math.random() * tableWidth);
            int randCompUnitY = (int )(Math.random() * tableHeight);

            compTable[randCompUnitY][randCompUnitX] = 1;
        }

        boolean isPlayerWon = false;
        boolean isCompWon = false;
        while (!isCompWon) {
            System.out.println("Current player table: ");
            for (int i = 0; i < tableHeight; i++) {
                for (int j = 0; j < tableWidth; j++) {
                    System.out.print(playerTable[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            System.out.println("Current comp table: ");
            for (int i = 0; i < tableHeight; i++) {
                for (int j = 0; j < tableWidth; j++) {
                    System.out.print(compTable[i][j] + " ");
                }
                System.out.println();
            }

            isCompWon = true;
        }
    }*/
    public static void main(String[] args) {
        int array18[] = {3, 7, 4, 8, 4, 0,};
        System.out.println(Arrays.toString(array18));
    }
}
