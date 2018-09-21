import java.util.Scanner;

public class SeaBattleRefactoredWithMethods {
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
        while (shipsPc != 0 && shipsPlayer != 0) {
            System.out.println("My turn");
            fieldPlayer = calculateFire(fieldPlayer);
            shipsPlayer = shipsLeft(fieldPlayer);
            redrawFields(fieldPlayer, shipsPlayer, fieldPc, shipsPc);
            if (shipsPlayer == 0) {
                continue;
            }
            fieldPc = calculateFire(fieldPc, scan);
            shipsPc = shipsLeft(fieldPc);
        }
        if (shipsPc == 0) {
            System.out.println("You are victorious, admiral!");
        } else System.out.println("You lose!");
    }

    static void redrawFields(byte[][] fieldPlayer, int shipsPlayer, byte[][] fieldPc, int shipsPc) {
        int boxPc;
        System.out.println("   Player   PC");
        System.out.println("   ships " + shipsPlayer + "  " + shipsPc);
        System.out.println("   1 2 3 4  1 2 3 4");
        System.out.println("   -------  -------");
        for (int countline = 0; countline < 4; countline++) {
            System.out.print(" " + (countline + 1) + "|");
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
    }

    static byte[][] calculateFire(byte[][] field) {
        boolean fire = false;
        int fireLine;
        int fireBox;
        while (!fire) {
            fireLine = (int) (Math.random() * 4);
            fireBox = (int) (Math.random() * 4);
            if (field[fireLine][fireBox] == 0) {
                fire = true;
                field[fireLine][fireBox] = 5;
            } else if (field[fireLine][fireBox] == 1) {
                fire = true;
                field[fireLine][fireBox] = 9;
            }
        }
        return field;
    }

    static byte[][] calculateFire(byte[][] field, Scanner scan) {
        boolean fire = false;
        int line;
        int box;
        while (!fire) {
            System.out.println("Fire line");
            line = scan.nextByte();
            System.out.println("Fire box");
            box = scan.nextByte();
            if (line < 1 || line > 4 || box < 1 || box > 4) {
                System.out.println("Wrong coordinates, try another");
            } else if (field[line - 1][box - 1] == 1) {
                fire = true;
                field[line - 1][box - 1] = 9;
                System.out.println("Direct hit!");
            } else if (field[line - 1][box - 1] == 0) {
                fire = true;
                field[line - 1][box - 1] = 5;
                System.out.println("Miss");
            } else if (field[line - 1][box - 1] == 5 || field[line - 1][box - 1] == 9) {
                System.out.println("Box already checked, try another");
            }
        }
        return field;
    }

    static int shipsLeft(byte[][] field) {
        int ships = 0;
        for (int line = 0; line < 4; line++) {
            for (int box = 0; box < 4; box++) {
                if (field[line][box] == 1) {
                    ships++;
                }
            }
        }
        return ships;
    }
}
