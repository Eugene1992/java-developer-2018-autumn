package java_essential.home_work01;

import java.util.Scanner;

public class HumanPlayer {
    private SeaBoard board;

    public HumanPlayer(int length, int amountOfShip) {
        this.board = new SeaBoard(length, amountOfShip);
    }

    public SeaBoard getBoard() {
        return board;
    }

    //    Метод для  считывания  введенных чисел кораблям
    private static int getScanSomeVariable() {
        Scanner scanCord = new Scanner(System.in);
        int someVariable = scanCord.nextInt();
        return someVariable;
    }

    //    Метод для  присвоения координат кораблям
    public static void setCoordShip(SeaBoard board, int amountOfShip, int seaSize) {
        int playerNumberShip = 1;
        for (int i = 0; i < amountOfShip; i++) {
            boolean playerAmountShip = false;
            while (playerAmountShip == false) {
                System.out.println("Enter number(from 0 to " + (seaSize - 1) + ") of line for your " + playerNumberShip + " ship");
                int coordX = getScanSomeVariable();
                System.out.println("Enter number(from 0 to " + (seaSize - 1) + ") of column for your " + playerNumberShip + " ship");
                int coordY = getScanSomeVariable();
                if (board.getSeaBox()[coordX][coordY].gethaveSomething().equals("Have ship")) {
                    playerAmountShip = false;
                } else {
                    Ship ship = new Ship(coordX, coordY);
                    board.getShips()[i] = ship;
                    board.getSeaBox()[coordX][coordY].setHaveSomething("Have ship");
                    playerNumberShip++;
                    playerAmountShip = true;
                }
            }
        }
    }

    //    Метод для выстрела
    public static int shotPlayer(SeaBoard board, int seaSize, int amountOfShip) {
        boolean badMemory = false;
        while (badMemory == false) {
            System.out.println("Enter number of line((from 0 to " + (seaSize - 1) + ")) for shot ");
            int shotX = getScanSomeVariable();
            System.out.println("Enter number of column(from 0 to " + (seaSize - 1) + ") for shot ");
            int shotY = getScanSomeVariable();
            int shipNumber = getShipNumner(board.getShips(), amountOfShip, shotX, shotY);
            if (board.getSeaBox()[shotX][shotY].gethaveSomething().equals("Have ship")) {
                board.getShips()[shipNumber].setIsAlive(false);
                System.out.println("You hit");
                board.getSeaBox()[shotX][shotY].setHaveSomething("Sunken");
                badMemory = true;
                amountOfShip--;
            } else {
                if (board.getSeaBox()[shotX][shotY].gethaveSomething().equals("Checked")) {
                    System.out.println("You have bad memory! Try again");
                    badMemory = false;
                } else {
                    System.out.println("You don't hit");
                    board.getSeaBox()[shotX][shotY].setHaveSomething("Checked");
                    writeHint(board, shotX, shotY, seaSize);
                    badMemory = true;
                }
            }
        }
        return amountOfShip;
    }

    //    Методя для поиска номера корабля
    public static int getShipNumner(Ship[] ship, int amountofShip, int shotX, int shotY) {
        int shipNumber = -1;
        for (int i = 0; i < amountofShip; i++) {
            if (ship[i].getCoordX() == shotX && ship[i].getCoordY() == shotY) {
                shipNumber = i;
            }
        }
        return shipNumber;
    }

    //    Метод для подсказки
    public static void writeHint(SeaBoard board, int shotX, int shotY, int seaSize) {
        int minX = Math.max((shotX - 1), 0);
        int minY = Math.max((shotY - 1), 0);
        int maxX = Math.min((shotX + 1), seaSize - 1);
        int maxY = Math.min((shotY + 1), seaSize - 1);
        int hint = 0;
        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {
                if (board.getSeaBox()[i][j].gethaveSomething().equals("Have ship")) {
                    System.out.println("Little hint for you: some ship is near your shot");
                }
            }
        }
    }

    //    Метод для  подсчета живых кораблей
    public static int getAmountOfShip(SeaBoard board) {
        int AmountOfShip = 0;
        for (Ship ships : board.getShips()) {
            if (ships.getIsAlive()) {
                AmountOfShip++;
            }
        }
        return AmountOfShip;
    }
}