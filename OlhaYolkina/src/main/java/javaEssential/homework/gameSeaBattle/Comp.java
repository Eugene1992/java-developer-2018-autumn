package javaEssential.homework.gameSeaBattle;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Comp extends Board{
    int compX;
    int compY;

    Board compMatrix = new Board();
    int compResult = 0;

    Comp setCoordinateToShoot(){
        int compX = random.nextInt(quantitySheep);
        int compY = random.nextInt(quantitySheep);
        return this;
    }

    Board setBoard() {
        return this.compMatrix.setMatrixByRandom(quantitySheep);
    }

    Comp shoot(Board matrix) {
        switch (matrix.gameMatrix[this.compX][this.compY]) {
            case 0: {
                System.out.println("No, sorry :(");
                matrix.gameMatrix[this.compX][this.compY] = -1;

                int nearX_ = max(this.compX - 1, 0);
                int nearY_ = max(this.compY - 1, 0);
                int nearX = min(this.compX + 2, matrix.tableHeight);
                int nearY = min(this.compY + 2, matrix.tableWidth);

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
                matrix.gameMatrix[this.compX][this.compY] = 10;
                this.compResult++;
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
