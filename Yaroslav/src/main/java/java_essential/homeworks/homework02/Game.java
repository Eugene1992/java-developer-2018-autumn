package java_essential.homeworks.homework02;

import java_essential.homeworks.homework02.*;

public class Game {
    public static void run() {
        int squadSize = 2;
        Player person = new Player(squadSize, false);
        person.addHeroes();
        person.outputSquadInformation();

        Player computer = new Player(1, true);
        computer.addHeroes();
        computer.outputSquadInformation();

        System.out.println("\n\n\n");
        person.fight(person, computer);
    }


}
