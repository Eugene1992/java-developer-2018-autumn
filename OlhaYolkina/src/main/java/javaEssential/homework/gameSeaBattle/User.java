package javaEssential.homework.gameSeaBattle;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class User extends Board {
    int userX;
    int userY;

    Board userMatrix = new Board();

    int userResult = 0;

    Board setBoard() {
        System.out.println("Please choose " + quantitySheep +" cells for game in format [x,y]. Possible values 0 - " + (tableHeight - 1));
        return this.userMatrix.setMatrixByScreen(quantitySheep);
    }

    User setCoordinateToShoot() {
        int flag;
        do {
            flag = 0;
            System.out.println("Your shoot. In format [x,y]. Possible values 0 - " + (tableHeight - 1));
            String coordinate;
            coordinate = scan.next();
            userX = coordinate.toCharArray()[1] - '0';
            userY = coordinate.toCharArray()[3] - '0';

            if (!((userX >= 0) && (userX <= tableHeight) && (userY >= 0) && (userY <= tableWidth))) {
                System.out.println("Incorrect coordinate. Try again. Possible values 0 - " + (tableHeight - 1));
                flag = 1;
            }
        } while (flag == 1);

        return this;
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
