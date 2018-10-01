package java_essential.home_work01;

import java.util.Scanner;

public class SeaBoard {
    private int boardLength;
    private Ship[] ships;
    private SeaBox[][] seaBox;
    private int shipNumber;

    //    Конструктор создания доски
    public SeaBoard(int length, int shipNumber) {
        this.boardLength = length;
        this.shipNumber = shipNumber;
        this.ships = new Ship[shipNumber];
        this.seaBox = new SeaBox[length][length];
        int seaBoxNumber = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                seaBox[i][j] = new SeaBox(i, j);
                seaBoxNumber++;
            }
        }
    }

    //    Метод для розмещения кораблей на доске
    private static void shipOnBoard(SeaBox[] seaBox, Ship[] ship) {
        for (SeaBox seaBoax : seaBox) {
            for (Ship ships : ship) {
                if (ships.getCoordX() == seaBoax.getCoordX() && ships.getCoordX() == seaBoax.getCoordX()) {
                    seaBoax.setHaveSomething("Have ship");
                }
            }
        }
    }

    public void setBoardLength(int boardLength) {
        if (boardLength > 0 && boardLength < 10) {
            this.boardLength = boardLength;
        } else {
            System.out.println("Error. It' very big sea)))");
        }
    }

    public int getBoardLength() {
        return boardLength;
    }

    public SeaBox[][] getSeaBox() {
        return seaBox;
    }

    public Ship[] getShips() {
        return ships;
    }


}



