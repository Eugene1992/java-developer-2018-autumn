package javaEssential.homework.gameRPG;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private static final Scanner scan = new Scanner(System.in);
    private static final Random random = new Random();

    private String user = "User";
    private boolean isComputer;
    private Hero[] team;

    public String getUser() {
        return this.user;
    }

    public boolean getIsComputer() {
        return isComputer;
    }

    public void setComputer() {
        String answer = "";
        while (!answer.equals("Yes") && !answer.equals("No")) {
            System.out.println("Is this user is Computer? Please write Yes or No");
            answer = scan.next();
        }
        if (answer.equals("Yes")) {
            this.isComputer = true;
            this.user = "Computer";
        }
    }

    public void setTeam() {
        int teamSize = 0;

        while (teamSize <= 0) {
            System.out.println("Please tap size of Team. Put number > 0");
            teamSize = scan.nextInt();
        }

        this.team = new Hero[teamSize];
        for (Hero aHero : team) {
            if (this.getIsComputer()) {
                aHero = chooseRaceByRandom();
            } else {
                aHero = chooseRaceByScreen();
            }
        }
    }

    private Hero chooseRaceByScreen() {
        String race = "";
        Hero aHero;
        while (!race.equals("O") && !race.equals("E") && !race.equals("H") && !race.equals("D")) {
            System.out.println("Please choose a race of Hero: O - Ork, E - Elf, H - Human and D - Dwarf");
            race = scan.next();
        }
        switch (race) {
            case "O":
                aHero = new Ork("Ork");
                return aHero;
            case "E":
                aHero = new Elf("Elf");
                return aHero;
            case "H":
                aHero = new Human("Human");
                return aHero;
            case "D":
                aHero = new Dwarf("Dwarf");
                return aHero;
        }
        return null;
    }

    private Hero chooseRaceByRandom() {
        int num = random.nextInt(4);
        Hero aHero;
        switch (num) {
            case 0:
                aHero = new Ork("Ork");
                return aHero;
            case 1:
                aHero = new Elf("Elf");
                return aHero;
            case 2:
                aHero = new Human("Human");
                return aHero;
            case 3:
                aHero = new Dwarf("Dwarf");
                return aHero;
        }
        return null;
    }
}
