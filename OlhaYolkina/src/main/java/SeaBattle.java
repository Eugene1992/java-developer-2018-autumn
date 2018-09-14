import java.util.Random;
import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        boolean[][] userMatrix = new boolean[4][4];
        boolean[][] compMatrix = new boolean[4][4];

        System.out.println("Please choose 4 cells for game in format [x, y]. Possible values 0 - 3");


        for (int i = 0; i < userMatrix.length; i++) {
            String coordinate;
            coordinate = scan.next();
            int a = coordinate.toCharArray()[1] - '0';
            userMatrix[coordinate.toCharArray()[1]][coordinate.toCharArray()[3]] = true;
        }

        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < userMatrix.length; j++) {
                System.out.print("arr[" + i + "][" + j + "]= " + userMatrix[i][j]);
            }
        }
    }
}
