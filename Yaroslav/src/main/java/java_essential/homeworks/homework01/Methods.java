package java_essential.homeworks.homework01;

import java.util.Random;
import java.util.Scanner;

/**
 * Клас, в котором храняться все методы необходимые для роботы игры
 */

public class Methods {

    public static boolean checkIfPlayerWon(Player person, Player computer) {
        boolean isGameEnd = false;
        if (Methods.countShips(computer.getBoard()) == 0) {
            System.out.println("Вы уничтожили вражеский флот.Вы победили!!");
            isGameEnd = true;
        }
        if (Methods.countShips(person.getBoard()) == 0) {
            System.out.println("Ваш флот был уничтожен. Вы проиграли...");
            isGameEnd = true;
        }
        return isGameEnd;
    }

    public static String outputShipBalance(Player player) {
        String result = "У ";
        int shipNumber = Methods.countShips(player.getBoard());
        if (player.isComputer()) {
            result += " врага ";
        } else {
            result += " вас ";
        }
        result += "осталось " + shipNumber;
        if (shipNumber > 1 && shipNumber < 5) {
            result += " корабля.";
        } else if (shipNumber == 1) {
            result += " корабль.";
        } else {
            result += " кораблей.";
        }
        return result;
    }

    public static boolean checkIfBoardBoxIsEmpty(Board board, int x, int y) {
        for (BoardBox boardBox : board.getBoardBoxes()) {
            if (boardBox.getX() == x && boardBox.getY() == y
                    && !(boardBox.getStatus().equals("Empty"))) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfShootNotRepeatInSamePlace(Board board, int x, int y) {
        for (BoardBox boardBox : board.getBoardBoxes()) {
            boolean isEnemyDestroyedShip = boardBox.getStatus().equals("Destroyed Enemy Ship");
            boolean isPersonDestroyedShip = boardBox.getStatus().equals("Destroyed Person Ship");
            boolean isAlreadyFired = boardBox.getStatus().equals("Already Fired");
            if (boardBox.getX() == x && boardBox.getY() == y
                    && (isAlreadyFired
                    || isEnemyDestroyedShip
                    || isPersonDestroyedShip)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfShootWasLuck(Board board, int x, int y) {
        for (Ship ship : board.getShips()) {
            if (ship.getX() == x && ship.getY() == y) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIfNotOnBoard(Board board, int x, int y) {
        if (x < 1 || x > board.getWidth()) {
            return true;
        }
        if (y < 1 || y > board.getHeight()) {
            return true;
        }
        return false;
    }

    public static boolean checkIfShootIsNearShip(Board board, int x, int y) {
        for (Ship ship : board.getShips()) {
            if ((ship.getX() == (x + 1) && ship.getY() == y)
                    || (ship.getX() == (x - 1) && ship.getY() == y)
                    || (ship.getX() == x && ship.getY() == (y - 1))
                    || (ship.getX() == x && ship.getY() == (y + 1))) {
                return true;
            }
        }
        return false;
    }

    public static void changeBoardBoxStatus(Board board, int x, int y, String newStatus) {
        for (BoardBox boardBox : board.getBoardBoxes()) {
            if (boardBox.getX() == x && boardBox.getY() == y) {
                boardBox.setStatus(newStatus);
            }
        }
    }

    public static void changeShipStatus(Board board, int x, int y) {
        for (Ship ship : board.getShips()) {
            if (ship.getX() == x && ship.getY() == y) {
                ship.setAlive(false);
            }
        }
    }

    public static int inputCoordinate(boolean isComputer, char c) {
        Scanner sc = new Scanner(System.in);
        int x;
        if (isComputer) {
            Random rand = new Random();
            x = rand.nextInt(4) + 1;
        } else {
            System.out.print("Введите координату по " + c + ": ");
            x = sc.nextInt();
        }
        return x;
    }

    public static int countShips(Board board) {
        int count = 0;
        for (Ship ship : board.getShips()) {
            if (ship.isAlive()) {
                count++;
            }
        }
        return count;
    }

    public static Ship placeShip(Board board, boolean isComputer) {
        int x;
        int y;
        while (true) {
            x = inputCoordinate(isComputer, 'x');
            y = inputCoordinate(isComputer, 'y');
            if (checkIfNotOnBoard(board, x, y)) {
                System.out.println("Вы вышли за границы поля. Повторите ввод.");
            } else if (checkIfBoardBoxIsEmpty(board, x, y)) {
                break;
            } else if (!isComputer) {
                System.out.println("В этом месте уже есть корабль. Выберите другую ячейку.");
            }
        }
        Ship ship = new Ship(x, y);
        if (isComputer) {
            changeBoardBoxStatus(board, x, y, "Enemy Ship");
        } else {
            changeBoardBoxStatus(board, x, y, "Person Ship");
        }
        outputBoard(board);
        return ship;
    }

    public static void placePlayerShips(Board board, boolean isComputer) {
        for (int i = 0; i < board.getShips().length; i++) {
            board.getShips()[i] = placeShip(board, isComputer);
        }
    }

    public static void changeStatusOfBoardBoxAndShip(Board board, int x, int y, boolean isComputer) {
        if (checkIfShootWasLuck(board, x, y) && isComputer) {
            changeBoardBoxStatus(board, x, y, "Destroyed Person Ship");
            changeShipStatus(board, x, y);
            System.out.println("Враг уничтожил ваш корабль.");
        } else if (checkIfShootWasLuck(board, x, y) && !isComputer) {
            changeBoardBoxStatus(board, x, y, "Destroyed Enemy Ship");
            changeShipStatus(board, x, y);
            System.out.println("Вы уничтожили корабль врага.");
        } else if (!checkIfShootWasLuck(board, x, y) && isComputer) {
            changeBoardBoxStatus(board, x, y, "Already Fired");
            System.out.println("Враг промахнулся.");
        } else if (checkIfShootIsNearShip(board, x, y) && !isComputer) {
            changeBoardBoxStatus(board, x, y, "Already Fired");
            System.out.println("Вы промахнулись.Но были близко.");
        } else {
            changeBoardBoxStatus(board, x, y, "Already Fired");
            System.out.println("Вы промахнулись.");
        }
    }

    public static void shot(Board board, boolean isComputer) {
        int x;
        int y;
        while (true) {
            x = inputCoordinate(isComputer, 'x');
            y = inputCoordinate(isComputer, 'y');
            if (checkIfNotOnBoard(board, x, y)) {
                System.out.println("Вы вышли за пределы поля. Повторите ввод.");
            } else if (checkIfShootNotRepeatInSamePlace(board, x, y)) {
                break;
            } else if (!isComputer) {
                System.out.println("В это место уже стреляли. Выберите другую ячейку.");
            }
        }
        changeStatusOfBoardBoxAndShip(board, x, y, isComputer);
        if (isComputer) {
            System.out.println("Ваше поле: ");
        } else {
            System.out.println("Поле врага: ");
        }
        outputBoard(board);
    }

    public static void outputBoard(Board board) {
        for (BoardBox boardBox : board.getBoardBoxes()) {
            if (boardBox.getY() == 1 && boardBox.getX() != 1) {
                System.out.print("\n");
            }
            if (boardBox.getStatus().equals("Empty")) {
                System.out.print("- ");
            }
            if (boardBox.getStatus().equals("Enemy Ship")) {
                System.out.print("0 ");
            }
            if (boardBox.getStatus().equals("Person Ship")) {
                System.out.print("X ");
            }
            if (boardBox.getStatus().equals("Already Fired")) {
                System.out.print("* ");
            }
            if (boardBox.getStatus().equals("Destroyed Enemy Ship")) {
                System.out.print("X ");
            }
            if (boardBox.getStatus().equals("Destroyed Person Ship")) {
                System.out.print("* ");
            }
        }
        System.out.print("\n\n");
    }

}
