package workPractice;

import java.util.Random;
import java.util.Scanner;

public class BattleShip {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int[][] userPlayer = new int[4][4];
        int[][] computer = new int[4][4];
        String str = "";

        for (int i = 0; i < userPlayer.length; i++) {
            System.out.println("Выбирете поле");
            str = scan.next();
            if (str.equals("0")) {

            }


        }


        System.out.println(userPlayer);
        System.out.println(computer);

    }
}
