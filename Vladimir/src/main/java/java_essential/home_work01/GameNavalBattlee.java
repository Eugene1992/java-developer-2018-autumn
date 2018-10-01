package java_essential.home_work01;

import java.util.Scanner;

public class GameNavalBattlee {
    public static void runGame() {
        int seaSize = seaSize();
        int amountofShip = amountOfShip();
        HumanPlayer humanPlayer = new HumanPlayer(seaSize, amountofShip);
        CompPlayer compPlayer = new CompPlayer(seaSize, amountofShip);
        HumanPlayer.setCoordShip(humanPlayer.getBoard(), amountofShip, seaSize);
        getSeaBoard(humanPlayer.getBoard(), seaSize);
        System.out.println(" ");
        CompPlayer.setCoordShip(compPlayer.getBoard(), amountofShip, seaSize);
        getSeaBoard(compPlayer.getBoard(), seaSize);
        System.out.println(" ");
        while (getAmountOfShip(humanPlayer.getBoard()) > 0 && getAmountOfShip(compPlayer.getBoard()) > 0) {
            System.out.println("You have " + getAmountOfShip(humanPlayer.getBoard()) + " ship(s)");
            System.out.println("Comp have " + getAmountOfShip(compPlayer.getBoard()) + " ship(s)");
            HumanPlayer.shotPlayer(compPlayer.getBoard(), seaSize, amountofShip);
            getSeaBoard(humanPlayer.getBoard(), seaSize);
            CompPlayer.shotComp(humanPlayer.getBoard(), seaSize, amountofShip);
            getSeaBoard(humanPlayer.getBoard(), seaSize);
        }
        whoWin(compPlayer);
    }

    public static void getSeaBoard(SeaBoard board, int seaSize) {
        for (int i = 0; i < seaSize; i++) {
            System.out.println(" ");
            for (int j = 0; j < seaSize; j++) {
                System.out.print(board.getSeaBox()[i][j].gethaveSomething() + " ");
            }
        }
        System.out.println(" ");
    }

    public static int getAmountOfShip(SeaBoard board) {
        int AmountOfShip = 0;
        for (Ship ships : board.getShips()) {
            if (ships.getIsAlive()) {
                AmountOfShip++;
            }
        }
        return AmountOfShip;
    }

    static public byte seaSize() {
        Scanner gameScan = new Scanner(System.in);
        System.out.println("Enter size of battlefield from 1 to 5:");
        byte seaSize = gameScan.nextByte();
        return seaSize;
    }

    static public byte amountOfShip() {
        Scanner gameScan = new Scanner(System.in);
        System.out.println("Enter amount of ship of ship from 1 to 5:");
        byte numberOfShip = gameScan.nextByte();
        return numberOfShip;
    }

    public static void whoWin(CompPlayer compPlayer) {
        if (HumanPlayer.getAmountOfShip(compPlayer.getBoard()) == 0) {
            System.out.println("Congratulations!! You win!!!");
        } else {
            System.out.println("Unfortunately you lost");
        }
    }
}

