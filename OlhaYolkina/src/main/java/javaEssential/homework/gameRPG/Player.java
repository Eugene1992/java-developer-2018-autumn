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
        while (!answer.equals("C") && !answer.equals("U")) {
            System.out.println("Choose opponent: C - Computer, U - User");
            answer = scan.next();
        }
        if (answer.equals("C")) {
            this.isComputer = true;
            this.user = "Computer";
        }
    }

    public Hero[] getTeam() {
        return this.team;
    }

    public void teamSize() {
        int teamSize = 0;

        while (teamSize <= 0) {
            System.out.println("Please tap size of Team. Put number > 0");
            teamSize = scan.nextInt();
        }
        this.team = new Hero[teamSize];
    }

    public void initializationTeamForNextUser(Player firstUser) {
        this.team = new Hero[firstUser.getTeam().length];
    }

    public void setTeamAfterLose(int indexHeroLose) {
        Hero[] newTeam = new Hero[this.team.length - 1];
        for (int i = 0; i < this.team.length - 1; i++) {
            if (i < indexHeroLose) {
                newTeam[i] = this.team[i];
            } else {
                newTeam[i] = this.team[i + 1];
            }
        }
        this.team = newTeam;
    }

    public void setTeam() {
        for (int i = 0; i < this.team.length; i++) {
            if (this.isComputer) {
                this.team[i] = chooseRaceByRandom();
            } else {
                this.team[i] = chooseRaceByScreen();
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

    public void outputTeam() {
        System.out.println(this.user + " team:");
        for (Hero aHero : this.team) {
            if (aHero != null) {
                System.out.println(aHero.getName() + "[" + aHero.getHealth() + "hp]");
            }
        }
        System.out.println();
    }
}
