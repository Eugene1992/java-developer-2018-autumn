package java_essential.homeworks.homework01;

import java.util.Scanner;

/**
 * Клас самой игры ShipBattle, в которо есть метод run(int height, int width, int shipNumber)
 * в котором и проходит сам процес игры(растановка кораблей игроком-человеком,
 * растановка кораблей компьютером и последовательные обсрелы игроками полей
 * друг дрга до победы)
 */

public class ShipBattle {

    public static void run() {
        int height = Methods.inputStartParameter("Введите ширину игрового поля: ");
        int width = Methods.inputStartParameter("Введите высоту игрового поля: ");
        int shipNumber = Methods.inputStartParameter("Введите количество кораблей: ");
        Player person = new Player(height, width, shipNumber, false);
        Methods.placePlayerShips(person.getBoard(), false);
        Player computer = new Player(height, width, shipNumber, true);
        Methods.placePlayerShips(computer.getBoard(), true);
        System.out.println("\n\nНачало Боя!!");
        while (true) {
            if (Methods.checkIfPlayerWon(person, computer)) {
                break;
            }
            Methods.shot(computer.getBoard(), false);
            if (Methods.checkIfPlayerWon(person, computer)) {
                break;
            }
            Methods.shot(person.getBoard(), true);
            System.out.println(Methods.outputShipBalance(person));
            System.out.println(Methods.outputShipBalance(computer));
        }
    }

}
