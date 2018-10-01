package java_essential.homeworks.homework02;


public class Game {
    public static void run() {
        int squadSize = 3;
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
