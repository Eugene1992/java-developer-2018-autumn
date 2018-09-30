package java_essential.homeworks.homework02;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        int squadSize = 3;
        Player person = new Player(squadSize, false);
        person.addHeroes();
        person.outputSquadInformation();

        Player computer = new Player(squadSize, true);
        computer.addHeroes();
        computer.outputSquadInformation();


    }


}
