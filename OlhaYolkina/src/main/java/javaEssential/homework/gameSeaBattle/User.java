package javaEssential.homework.gameSeaBattle;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class User extends Board {
    int[] coordinate = setCoordinateToShoot();
    int userX = coordinate[0];
    int userY = coordinate[1];

    int userResult = 0;

    Board

    private int[] setCoordinateToShoot() {
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
    }

    User shoot(Board matrix) {
        switch (matrix.gameMatrix[this.userX][this.userY]) {
            case 0: {
                System.out.println("No, sorry :(");
                matrix.gameMatrix[this.userX][this.userY] = -1;

                int nearX_ = max(this.userX - 1, 0);
                int nearY_ = max(this.userY - 1, 0);
                int nearX = min(this.userX + 2, matrix.tableHeight);
                int nearY = min(this.userY + 2, matrix.tableWidth);

                int near = 0;

                for (int j = nearX_; j < nearX; j++) {
                    for (int k = nearY_; k < nearY; k++) {
                        if (matrix.gameMatrix[j][k] == 1) {
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
                matrix.gameMatrix[this.userX][this.userY] = 10;
                this.userResult++;
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
        return this;
    }
}
