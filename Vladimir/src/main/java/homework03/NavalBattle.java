package homework03;

import java.util.Arrays;
import java.util.Scanner;

public class NavalBattle {
    public static void main(String[] args) {
        System.out.println("Hello my dear friend! It's new very interesting game - Simple Naval Battle in Idea");
        int[][] comp = new int[4][4];
        int[][] my = new int[4][4];
        int compX;
        int compY;
        int myX;
        int myY;

//        Формування поля та розміщення кораблів комп'ютером
        for (int i = 0; i < 4; i++) {
            boolean compfourShip = false;
            while (compfourShip == false) {
                compX = (int) (Math.random() * 4);
                compY = (int) (Math.random() * 4);
                if (comp[compX][compY] == 1) {
                    compfourShip = false;
                } else {
                    comp[compX][compY] = 1;
                    compfourShip = true;
                }
            }
        }
        System.out.println(Arrays.deepToString(comp));

//        Формування поля та розміщення кораблів користувачем
        Scanner scanCord = new Scanner(System.in);
        int myNumberShip = 1;
        for (int j = 0; j < 4; j++) {
            boolean myFourShip1 = false;
            while (myFourShip1 == false) {
                System.out.println("Enter number of line for your " + myNumberShip + " ship");
                myX = scanCord.nextInt();
                System.out.println("Enter number of column for your " + myNumberShip + " ship");
                myY = scanCord.nextInt();
                switch (my[myX][myY]) {
                    case 1:
                        myFourShip1 = false;
                        break;
                    case 0:
                        if (myX < 0 || myX > 3 || myY < 0 || myY > 3) {
                            myFourShip1 = false;
                        } else {
                            my[myX][myY] = 1;
                            myNumberShip++;
                            myFourShip1 = true;
                        }
                        break;
                }
            }
        }
        System.out.println(Arrays.deepToString(my));

//        Початок гри
        int compShip = 4;
        int myShip = 4;
        while (compShip > 0 && myShip > 0) {
//        Хід гравця
            boolean badMemory = false;
            while (badMemory == false) {
                System.out.println("Enter number of line for shot ");
                int myShutX = scanCord.nextInt();
                System.out.println("Enter number of column for shot ");
                int myShutY = scanCord.nextInt();
                int minX = Math.max((myShutX - 1), 0);
                int minY = Math.max((myShutY - 1), 0);
                int maxX = Math.min((myShutX + 1), 3);
                int maxY = Math.min((myShutY + 1), 3);
                int hint = 0;
                if (comp[myShutX][myShutY] == -1) {
                    System.out.println("You have bad memory! Try again");
                    badMemory = false;
                }
                if (comp[myShutX][myShutY] == 1) {
                    System.out.println("You hit");
                    comp[myShutX][myShutY] = -1;
                    compShip = compShip - 1;
                    badMemory = true;
                }
                if (comp[myShutX][myShutY] == 0) {
                    System.out.println("You don't hit");
//                    Підказка
                    for (int i = minX; i <= maxX; i++) {
                        for (int j = minY; j <= maxY; j++) {
                            if (comp[i][j] == 1) {
                                hint++;
                            }
                        }
                    }
                    if (hint > 0) {
                        System.out.println("Little hint for you: some ship is near your shot");
                    }
                    comp[myShutX][myShutY] = -1;
                    badMemory = true;
                }
            }

//        Хід компютера
            boolean compBadMemory = false;
            while (compBadMemory == false) {
                int compShutX = (int) (Math.random() * 4);
                int compShutY = (int) (Math.random() * 4);
                if (my[compShutX][compShutY] == -1) {
                    compBadMemory = false;
                }
                if (my[compShutX][compShutY] == 1) {
                    System.out.println("Comp shot: " + compShutX + " " + compShutY + " and he hit");
                    my[compShutX][compShutY] = -1;
                    myShip = myShip - 1;
                    compBadMemory = true;
                }
                if (my[compShutX][compShutY] == 0) {
                    System.out.println("Comp shot: " + compShutX + " " + compShutY + " and he miss");
                    my[compShutX][compShutY] = -1;
                    compBadMemory = true;
                }
            }
        }
        if (compShip == 0) {
            System.out.println("Congratulations!! You win!!!");
        }
        if (myShip == 0) {
            System.out.print("Unfortunately you lost");
        }
    }
}

