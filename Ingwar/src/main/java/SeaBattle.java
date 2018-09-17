import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        byte[][] fieldPc = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        byte[][] fieldPlayer = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        Scanner scan = new Scanner(System.in);
        System.out.println("Initialising my field");
        for (int count = 0; count < 4; count++) {
            int randomStr = (int) (Math.random() * 4);
            int randomBox = (int) (Math.random() * 4);
            if (fieldPc[randomStr][randomBox] == 0) {
                fieldPc[randomStr][randomBox] = 1;
            } else count--;
        }
        System.out.println("Input your coordinates");
        System.out.println("From 1 to 4 on both lines");
        int line;
        int box;
        for (int count = 1; count < 5; count++) {
            System.out.println("ship " + count + " line");
            line = scan.nextByte();
            System.out.println("ship " + count + " box");
            box = scan.nextByte();
            if (line < 1 || line > 4 || box < 1 || box > 4) {
                System.out.println("Wrong coordinates, try another");
                count--;
            } else if (fieldPlayer[line - 1][box - 1] == 1) {
                System.out.println("Box used, try another");
                count--;
            } else fieldPlayer[line - 1][box - 1] = 1;
        }
        int shipsPc = 4;
        int shipsPlayer = 4;
        int fireLine;
        int fireBox;
        boolean fire;
        int boxPc;
        while (shipsPc != 0 && shipsPlayer != 0) {
            System.out.println("My turn");
            fire = false;
            while (!fire) {
                fireLine = (int) (Math.random() * 4);
                fireBox = (int) (Math.random() * 4);
                if (fieldPlayer[fireLine][fireBox] == 0) {
                    fire = true;
                    fieldPlayer[fireLine][fireBox] = 5;
                } else if (fieldPlayer[fireLine][fireBox] == 1) {
                    fire = true;
                    fieldPlayer[fireLine][fireBox] = 9;
                    shipsPlayer--;
                }
            }
            System.out.println("   Player   PC");
            System.out.println("   ships " + shipsPlayer + "  " + shipsPc);
            if (shipsPlayer == 0) {
                continue;
            }
            System.out.println("   1 2 3 4  1 2 3 4");
            for (int countline = 0; countline < 4; countline++) {
                System.out.print(" " + (countline + 1) + " ");
                for (int countBox = 0; countBox < 4; countBox++) {
                    System.out.print(fieldPlayer[countline][countBox] + " ");
                }
                System.out.print(" ");
                for (int countBox = 0; countBox < 4; countBox++) {
                    boxPc = fieldPc[countline][countBox];
                    int lowLine = countline - 1 > 0 ? countline - 1 : 0;
                    int highLine = countline + 1 > 3 ? 3 : countline + 1;
                    int lowBox = countBox - 1 > 0 ? countBox - 1 : 0;
                    int highBox = countBox + 1 > 3 ? 3 : countBox + 1;
                    for (int checkLine = lowLine; checkLine <= highLine; checkLine++) {
                        for (int checkBox = lowBox; checkBox <= highBox; checkBox++) {
                            if (checkBox != countBox || checkLine != countline) {
                                if (fieldPc[checkLine][checkBox] == 9 || fieldPc[checkLine][checkBox] == 5) {
                                    boxPc = boxPc == 1 ? 7 : boxPc;
                                }
                            }
                        }
                    }
                    boxPc = boxPc == 1 ? 0 : boxPc;
                    System.out.print(boxPc + " ");
                }
                System.out.println(" ");
            }
            System.out.println("Legend:");
            System.out.println("0 - water, 1 - ship, 5 - miss, 7 - suggestion, 9 - shipwreck");
            System.out.println("Your turn");
            fire = false;
            while (!fire) {
                System.out.println("Fire line");
                line = scan.nextByte();
                System.out.println("Fire box");
                box = scan.nextByte();
                if (line < 1 || line > 4 || box < 1 || box > 4) {
                    System.out.println("Wrong coordinates, try another");
                } else if (fieldPc[line - 1][box - 1] == 1) {
                    fire = true;
                    fieldPc[line - 1][box - 1] = 9;
                    shipsPc--;
                    System.out.println("Direct hit!");
                } else if (fieldPc[line - 1][box - 1] == 0) {
                    fire = true;
                    fieldPc[line - 1][box - 1] = 5;
                    System.out.println("Miss");
                } else if (fieldPc[line - 1][box - 1] == 5 || fieldPc[line - 1][box - 1] == 9) {
                    System.out.println("Box already checked, try another");
                }
            }
        }
        if (shipsPc == 0) {
            System.out.println("You are victorious, admiral!");
        } else System.out.println("You lose!");
    }
}
