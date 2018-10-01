package javaEssential.homework.gameRPG;

import java.util.Random;
import java.util.Scanner;

public class GameProcess {
    private static final Scanner scan = new Scanner(System.in);
    private static final Random random = new Random();
    private static int teamSize = 0;

    public void startGame() {
        System.out.println("Hi! It is RPG game Fight.");
        System.out.println("The main goal is Win. For take it you should bring team.");
        System.out.println("You can choose: Ork, Elf, Human and Dwarf.");
        System.out.println("Are you ready?");
        System.out.println("Go!!!");
    }

    public static int getTeamSize() {
        return teamSize;
    }

    public static void setTeamSize() {
        while (teamSize <= 0) {
            System.out.println("Please tap size of Team. Put number > 0");
            teamSize = scan.nextInt();
        }
    }

    public Player isItComputer(Player player) {
        String answer = "";
        while (!answer.equals("Yes") && !answer.equals("No")) {
            System.out.println("Is this user is Computer? Please write Yes or No");
            answer = scan.next();
            player.setIsComputer(answer);
        }
        return player;
    }

    public Hero[] makeTeam(Player player) {
        Hero[] team = new Hero[teamSize];
        for (Hero aHero : team) {
            if (player.getIsComputer()) {
                aHero = chooseRaceByRandom(aHero);
            } else {
                aHero = chooseRaceByScreen(aHero);
            }
        }
        return team;
    }

    private Hero chooseRaceByScreen(Hero aHero) {
        String race = "";
        while (!race.equals("O") && !race.equals("E") && !race.equals("H") && !race.equals("D")) {
            System.out.println("Please choose a race of Hero: O - Ork, E - Elf, H - Human and D - Dwarf");
            race = scan.next();
        }
        switch (race) {
            case "O":
                aHero = new Ork("ork");
                return aHero;
            case "E":
                aHero = new Elf("elf");
                return aHero;
            case "H":
                aHero = new Human("human");
                return aHero;
            case "D":
                aHero = new Dwarf("dwarf");
                return aHero;
        }
        return aHero;
    }

    private Hero chooseRaceByRandom(Hero aHero) {
        int num = random.nextInt(4);

        switch (num) {
            case 0:
                aHero = new Ork("ork");
                return aHero;
            case 1:
                aHero = new Elf("elf");
                return aHero;
            case 2:
                aHero = new Human("human");
                return aHero;
            case 3:
                aHero = new Dwarf("dwarf");
                return aHero;
        }

        return aHero;
    }
}
