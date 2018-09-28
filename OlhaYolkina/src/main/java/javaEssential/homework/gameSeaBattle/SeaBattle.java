package javaEssential.homework.gameSeaBattle;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class SeaBattle {


    public static void main(String[] args) {


/*        int tableHeight = 4;
        int tableWidth = 4;
        int quantitySheep = 4;

        int[][] userMatrix = new int[tableHeight][tableWidth];
        int[][] compMatrix = new int[tableHeight][tableWidth]; */

        System.out.println("Please choose " + quantitySheep +" cells for game in format [x,y]. Possible values 0 - " + (tableHeight - 1));

        userMatrix = setMatrixByScreen(userMatrix, quantitySheep, scan);
        compMatrix = setMatrixByRandom(compMatrix, quantitySheep, random);

        outputMatrix(compMatrix, tableHeight, tableWidth);

        int resultUser = 0;
        int resultComp = 0;

        while (!(resultUser == quantitySheep) && !(resultComp == quantitySheep)) {
/*            int[] coordinate = setCoordinateToShoot(tableHeight, tableWidth, scan);
            int userX = coordinate[0];
            int userY = coordinate[1]; */

            resultUser = shoot(compMatrix, userX, userY, resultUser, tableHeight, tableWidth);

/*            int compX = random.nextInt(quantitySheep);
            int compY = random.nextInt(quantitySheep); */

            System.out.println("Comp shoot - " + "[" + compX + "," + compY + "] = " + userMatrix[compX][compY]);

            resultComp = shoot(userMatrix, compX, compY, resultComp, tableHeight, tableWidth);
        }

        System.out.println();
        System.out.println();
        if (resultUser == quantitySheep) {
            System.out.println("You win!!!");
        } else if (resultComp == quantitySheep) {
            System.out.println("Computer win");
        }
    }

/*    static int[][] setMatrixByScreen(int[][] matrix, int quantity, Scanner scan) {
        int userCount = 0;
        while (userCount < quantity) {
            String coordinate;
            coordinate = scan.next();
            int x = coordinate.toCharArray()[1] - '0';
            int y = coordinate.toCharArray()[3] - '0';

            if (matrix[x][y] == 1) {
                System.out.println("This cell is already choosen. Please, choose another one");
            } else if ((x >= 0) && (x <= 3) && (y >= 0) && (y <= 3)) {
                matrix[x][y] = 1;
                userCount++;
            } else {
                System.out.println("Incorrect coordinate. Try again. Possible values 0 - " + (quantity - 1));
            }
        }
        return matrix;
    }

    static int[][] setMatrixByRandom(int[][] matrix, int quantity, Random random) {
        int count = 0;
        while (count < quantity) {
            int x = random.nextInt(quantity);
            int y = random.nextInt(quantity);

            if (matrix[x][y] == 0) {
                matrix[x][y] = 1;
                count++;
            }
        }
        return matrix;
    } */

 /*   static void outputMatrix(int[][] matrix, int tableHeight, int tableWidth) {
        for (int i = 0; i < tableHeight; i++) {
            for (int j = 0; j < tableWidth; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    } */

/*    static int[] setCoordinateToShoot(int tableHeight, int tableWidth, Scanner scan) {
        int[] coordinateMatrix = new int[2];

        int flag;
        do {
            flag = 0;
            System.out.println("Your shoot. In format [x,y]. Possible values 0 - " + (tableHeight - 1));
            String coordinate;
            coordinate = scan.next();
            coordinateMatrix[0] = coordinate.toCharArray()[1] - '0';
            coordinateMatrix[1] = coordinate.toCharArray()[3] - '0';

            if (!((coordinateMatrix[0] >= 0) && (coordinateMatrix[0] <= tableHeight) && (coordinateMatrix[1] >= 0) && (coordinateMatrix[1] <= tableWidth))) {
                System.out.println("Incorrect coordinate. Try again. Possible values 0 - " + (tableHeight - 1));
                flag = 1;
            }
        } while (flag == 1);

        return coordinateMatrix;
    } */

/*    static int shoot(int[][] matrix, int x, int y, int result, int height, int width) {
        switch (matrix[x][y]) {
            case 0: {
                System.out.println("No, sorry :(");
                matrix[x][y] = -1;

                int nearX_ = max(x - 1, 0);
                int nearY_ = max(y - 1, 0);
                int nearX = min(x + 2, height);
                int nearY = min(y + 2, width);

                int near = 0;

                for (int j = nearX_; j < nearX; j++) {
                    for (int k = nearY_; k < nearY; k++) {
                        if (matrix[j][k] == 1) {
                            near++;
                        }
                    }
                }

                if (near > 0) {
                    System.out.println("Ooo! The goal is near!");
                }
                break;
            }
            case 1: {
                System.out.println("Yes!");
                matrix[x][y] = 10;
                result++;
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
        return result;
    } */
}