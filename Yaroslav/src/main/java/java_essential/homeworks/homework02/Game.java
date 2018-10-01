package java_essential.homeworks.homework02;

import java.util.Scanner;


/**
 * Клас Game это клас в котором непосредствено и происходят все этапы игры(создание
 * персоажей компьютером и человком и сама битва между отрядами). Вся игра
 * происходит в методе run()
 */

public class Game {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер отряда: ");
        int squadSize = sc.nextInt();
        Player person = new Player(squadSize, false);
        person.addHeroes();
        person.outputSquadInformation();

        Player computer = new Player(squadSize, true);
        computer.addHeroes();
        computer.outputSquadInformation();

        System.out.println("\n\n\n\n\n\n\n");
        person.fight(person, computer);
    }


}
