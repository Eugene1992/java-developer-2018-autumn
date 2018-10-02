package javaEssential.homework.gameRPG;

import java.util.Random;

public class GameProcess {
    private static final Random random = new Random();

    public void startGame() {
        System.out.println("Hi! It is RPG game Fight.");
        System.out.println("The main goal is Win. For take it you should bring team.");
        System.out.println("You can choose: Ork, Elf, Human and Dwarf.");
        System.out.println("Are you ready?");
        System.out.println("Go!!!");
    }

    public Hero[] stepFight(Hero[] teamAttack, Hero[] teamArmor) {

        int indexHeroAttack = random.nextInt(teamAttack.length);
        int indexHeroArmor = random.nextInt(teamArmor.length);

        int heroArmorHealth = teamArmor[indexHeroArmor].getHealth();
        double heroArmorArmor = teamArmor[indexHeroArmor].getArmor();

        int heroAttackAttack = teamAttack[indexHeroAttack].getAttack();

        teamArmor[indexHeroArmor].setHealth((int) (heroArmorHealth - (1 - heroArmorArmor) * heroAttackAttack));



        logStepFight(teamAttack[indexHeroAttack], teamArmor[indexHeroArmor]);

        return teamArmor;
    }

    private void logStepFight(Hero heroAttack, Hero heroArmor) {
        System.out.println("Player Dwarf 'Astan'[340hp] attacked PC Elf 'Eliot'[321hp], damage caused is 121 hp");
    }
}
