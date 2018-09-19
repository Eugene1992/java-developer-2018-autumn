package workPractice;

import java.util.Random;
import java.util.Scanner;

public class BattleShip {
    public static void main(String[] args) {

    }

    public class Game {
        public void startGame() {
            Cell cell = new Cell();
            cell.fillField();
            cell.viewField();
            cell.autoInitField();//в данном методе не соображу как размещать корабли
            cell.viewField();
        }
    }


    public class Cell {
        Scanner scanner = new Scanner(System.in);
        static final int SIZE = 10; // фиксированный размер поля для игры
        char cells[][] = new char[SIZE][SIZE]; // создание поля
        FactoryShip factoryShip = new FactoryShip();
        Ship arrShipOfCell[]; //Данному массиву присвоится массив кораблей
        //созданных в классе FactoryShip


        public void fillField() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    cells[i][j] = '.';
                }
            }
            System.out.println("");
        }

        public void viewField() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(cells[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }

        void autoInitField() {
            arrShipOfCell = factoryShip.initShip();
            //Не знаю как поместить корабли в cells[][]
        }
    }

    public class FactoryShip {
        final int[] DECK = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4}; // колличество палуб у
        // кораблей
        Random random = new Random();
        Ship ship;
        Ship arrShips[] = new Ship[10];

        Ship[] initShip() {
            for (int i = 0; i < DECK.length; i++) {
                int tmp = random.nextInt((Cell.SIZE + 1) - DECK[i]);//начальные
                //координаты размещения корабля
                ship = new Ship(DECK[i], tmp, (tmp + i));
                arrShips[i] = ship;
            }
            return arrShips;
        }
    }


    public class Ship {
        private int deck, xPosition, yPosition;

        Ship(int deck, int x, int y) {
            this.deck = deck;
            this.xPosition = x;
            this.yPosition = y;
        }

        public int getDeck() {
            return deck;
        }

        public int getxPosition() {
            return xPosition;
        }

        public int getyPosition() {
            return yPosition;
        }
    }
}
