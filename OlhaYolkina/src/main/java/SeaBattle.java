import java.util.Random;
import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int tableHeight = 4;
        int tableWidth = 4;

        int[][] userMatrix = new int[4][4];
        int[][] compMatrix = new int[4][4];

        System.out.println("Please choose 4 cells for game in format [x,y]. Possible values 0 - 3");


        for (int i = 0; i < tableHeight; i++) {
                String coordinate;
                coordinate = scan.next();
                int x = coordinate.toCharArray()[1] - '0';
                int y = coordinate.toCharArray()[3] - '0';

                userMatrix[x][y] = 1;
        }

        for (int i = 0; i < tableHeight; i++) {
            for (int j = 0; j < tableWidth; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
