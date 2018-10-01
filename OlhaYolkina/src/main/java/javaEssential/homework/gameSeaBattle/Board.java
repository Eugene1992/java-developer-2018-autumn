package javaEssential.homework.gameSeaBattle;

import java.util.Random;
import java.util.Scanner;

public class Board extends GamePlayer{
    int tableHeight = 4;
    int tableWidth = 4;

    static Random random = new Random();
    static Scanner scan = new Scanner(System.in);

    int[][] gameMatrix = new int[tableHeight][tableWidth];

    void outputMatrix() {
        for (int i = 0; i < tableHeight; i++) {
            for (int j = 0; j < tableWidth; j++) {
                System.out.print(this.gameMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    Board setMatrixByScreen(int quantity) {
        int userCount = 0;
        while (userCount < quantity) {
            String coordinate;
            coordinate = scan.next();
            int x = coordinate.toCharArray()[1] - '0';
            int y = coordinate.toCharArray()[3] - '0';

            if (this.gameMatrix[x][y] == 1) {
                System.out.println("This cell is already choosen. Please, choose another one");
            } else if ((x >= 0) && (x <= 3) && (y >= 0) && (y <= 3)) {
                this.gameMatrix[x][y] = 1;
                userCount++;
            } else {
                System.out.println("Incorrect coordinate. Try again. Possible values 0 - " + (quantity - 1));
            }
        }
        return this;
    }

    Board setMatrixByRandom(int quantity) {
        int count = 0;
        while (count < quantity) {
            int x = random.nextInt(quantity);
            int y = random.nextInt(quantity);

            if (this.gameMatrix[x][y] == 0) {
                this.gameMatrix[x][y] = 1;
                count++;
            }
        }
        return this;
    }
}
