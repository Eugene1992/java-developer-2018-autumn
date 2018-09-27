package java_essential.homeworks.homework01;

/**
 * Клас самой игры ShipBattle, в которо есть метод run(int height, int width, int shipNumber)
 * в котором и проходит сам процес игры(растановка кораблей игроком-человеком,
 * растановка кораблей компьютером и последовательные обсрелы игроками полей
 * друг дрга до победы)
 */

public class ShipBattle {

    public static void run(int height, int width, int shipNumber) {
        Player person = new Player(height, width, shipNumber, false);
        Methods.placePlayerShips(person.getBoard(), false);
        Player computer = new Player(height, width, shipNumber, true);
        Methods.placePlayerShips(computer.getBoard(), true);
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
