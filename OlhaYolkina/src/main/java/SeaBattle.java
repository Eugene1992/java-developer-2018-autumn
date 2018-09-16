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


        int count = 0;
        while (count < 4) {
            int x = random.nextInt(4);
            int y = random.nextInt(4);

            if (compMatrix[x][y] == 0) {
                compMatrix[x][y] = 1;
                count++;
            }
        }

        for (int i = 0; i < tableHeight; i++) {
            for (int j = 0; j < tableWidth; j++) {
                System.out.print(compMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int resultUser = 0;
        int resultComp = 0;

        while (!(resultUser == 4) && !(resultComp == 4)) {
            System.out.println("Your shoot. In format [x,y]. Possible values 0 - 3");
            String coordinate;
            coordinate = scan.next();
            int userX = coordinate.toCharArray()[1] - '0';
            int userY = coordinate.toCharArray()[3] - '0';

            switch (compMatrix[userX][userY]) {
                case 0: {
                    System.out.println("No, sorry :(");
                    compMatrix[userX][userY] = -1;
                    break;
                }
                case 1: {
                    System.out.println("Yes!");
                    compMatrix[userX][userY] = 10;
                    resultUser++;
                    break;
                }
                case 10: {
                    System.out.println("Oops, this cell have already shooted");
                    break;
                }
                case -1: {
                    System.out.println("Oops, this cell have already shooted");
                    break;
                }
            }

            int compX = random.nextInt(4);
            int compY = random.nextInt(4);

            System.out.println("Comp shoot - " + "[" + compX + "," + compY + "] = " + userMatrix[compX][compY]);

            switch (userMatrix[compX][compY]) {
                case 0: {
                    System.out.println("No, sorry :(");
                    userMatrix[compX][compY] = -1;
                    break;
                }
                case 1: {
                    System.out.println("Yes!");
                    userMatrix[compX][compY] = 10;
                    resultComp++;
                    break;
                }
                case 10: {
                    System.out.println("Oops, this cell have already shooted");
                    break;
                }
                case -1: {
                    System.out.println("Oops, this cell have already shooted");
                    break;
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();
        if (resultUser == 4) {
            System.out.println("You win!!!");
        } else if (resultComp == 4) {
            System.out.println("Computer win");
        }
    }
}
