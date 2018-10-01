package javaEssential.homework.gameRPG;

import java.util.Scanner;

public class GameProcess {
    private static final Scanner scan = new Scanner(System.in);
    private static int teamSize = 0;

    public void startGame(){
        System.out.println("Hi! It is RPG game Fight.");
        System.out.println("The main goal is Win. For take it you should bring team.");
        System.out.println("You can choose: Ork, Elf, Human and Dwarf.");
        System.out.println("Are you ready?");
        System.out.println("Go!!!");
    }

    public static int getTeamSize(){
        return teamSize;
    }

    public static void setTeamSize() {
        while (teamSize <= 0) {
            System.out.println("Please tap size of Team. Put number > 0");
            teamSize = scan.nextInt();
        }
    }

//    public Hero[] makeTeam(Player player)
}
