package javaEssential.homework.gameRPG;

import java.util.Random;

public class GameProcess {
    private static final Random random = new Random();
    private int numberOfStepFight = 0;

    public void startGame() {
        System.out.println("Hi! It is RPG game Fight.");
        System.out.println("The main goal is Win. For take it you should bring team.");
        System.out.println("You can choose: Ork, Elf, Human and Dwarf.");
        System.out.println("Are you ready?");
        System.out.println("Go!!!");
    }

    public void stepFight(Player playerAttack, Player playerArmor) {
        int indexHeroAttack = random.nextInt(playerAttack.getTeam().length);
        int indexHeroArmor = random.nextInt(playerArmor.getTeam().length);

        numberOfStepFight++;
        System.out.println("Round #" + numberOfStepFight);
        playerAttack.outputTeam();
        playerArmor.outputTeam();

        int heroArmorHealth = playerArmor.getTeam()[indexHeroArmor].getHealth();
        double heroArmorArmor = playerArmor.getTeam()[indexHeroArmor].getArmor();

        int heroAttackAttack = playerAttack.getTeam()[indexHeroAttack].getAttack();

        playerAttack.getTeam()[indexHeroAttack].setIfSpecialAbility();
        playerArmor.getTeam()[indexHeroArmor].setIfSpecialAbility();

        boolean isSpecialAbilityHeroAttack = playerAttack.getTeam()[indexHeroAttack].getIsSpecialAbility();
        boolean isSpecialAbilityHeroArmor = playerArmor.getTeam()[indexHeroArmor].getIsSpecialAbility();

        if (!isSpecialAbilityHeroArmor && !isSpecialAbilityHeroAttack) {
            playerArmor.getTeam()[indexHeroArmor].setHealth((int) (heroArmorHealth - (1 - heroArmorArmor) * heroAttackAttack));
        }
        if (isSpecialAbilityHeroArmor && isSpecialAbilityHeroAttack) {
            if (playerArmor.getTeam()[indexHeroArmor].getSpecialAbility().equals("Dodge attack")) {
                playerArmor.getTeam()[indexHeroArmor].applySpecialAbilityHeroArmor();
            } else {
                if (playerAttack.getTeam()[indexHeroAttack].getSpecialAbility().equals("Increased attack")) {
                    heroAttackAttack = (int) (heroAttackAttack * (1 + playerAttack.getTeam()[indexHeroAttack].applySpecialAbilityHeroAttack()));
                }
                if (playerAttack.getTeam()[indexHeroAttack].getSpecialAbility().equals("Health restore")) {
                    int newHealth = (int) (playerAttack.getTeam()[indexHeroAttack].getHealth() * (1 + playerAttack.getTeam()[indexHeroAttack].applySpecialAbilityHeroAttack()));
                    playerAttack.getTeam()[indexHeroAttack].setHealth(newHealth);
                }
                if (playerArmor.getTeam()[indexHeroArmor].getSpecialAbility().equals("Attack blocking")) {
                    heroAttackAttack = (int) (heroAttackAttack * playerArmor.getTeam()[indexHeroArmor].applySpecialAbilityHeroArmor());
                }
                playerArmor.getTeam()[indexHeroArmor].setHealth((int) (heroArmorHealth - (1 - heroArmorArmor) * heroAttackAttack));
            }
        }
        if (isSpecialAbilityHeroArmor && !isSpecialAbilityHeroAttack) {
            if (playerArmor.getTeam()[indexHeroArmor].getSpecialAbility().equals("Dodge attack")) {
                playerArmor.getTeam()[indexHeroArmor].applySpecialAbilityHeroArmor();
            } else {
                if (playerArmor.getTeam()[indexHeroArmor].getSpecialAbility().equals("Attack blocking")) {
                    heroAttackAttack *= playerArmor.getTeam()[indexHeroArmor].applySpecialAbilityHeroArmor();
                }
                playerArmor.getTeam()[indexHeroArmor].setHealth((int) (heroArmorHealth - (1 - heroArmorArmor) * heroAttackAttack));
            }
        }
        if (!isSpecialAbilityHeroArmor && isSpecialAbilityHeroAttack) {
            if (playerAttack.getTeam()[indexHeroAttack].getSpecialAbility().equals("Increased attack")) {
                heroAttackAttack *= playerAttack.getTeam()[indexHeroAttack].applySpecialAbilityHeroAttack();
            }
            if (playerAttack.getTeam()[indexHeroAttack].getSpecialAbility().equals("Health restore")) {
                int newHealth = (int) (playerAttack.getTeam()[indexHeroAttack].getHealth() * (1 + playerAttack.getTeam()[indexHeroAttack].applySpecialAbilityHeroAttack()));
                playerAttack.getTeam()[indexHeroAttack].setHealth(newHealth);
            }
            playerArmor.getTeam()[indexHeroArmor].setHealth((int) (heroArmorHealth - (1 - heroArmorArmor) * heroAttackAttack));
        }

        int damage = heroArmorHealth - playerArmor.getTeam()[indexHeroArmor].getHealth();


        System.out.print(playerAttack.getUser() + " " + playerAttack.getTeam()[indexHeroAttack].getName() +
                "[" + playerAttack.getTeam()[indexHeroAttack].getHealth() + "hp] attacked " + playerArmor.getUser()
                + " " + playerArmor.getTeam()[indexHeroArmor].getName() + "[" + playerArmor.getTeam()[indexHeroArmor].getHealth()
                + "hp], ");
        if (damage != 0) {
            System.out.print("damage caused is " + damage + "hp\n\n");
        } else {
            System.out.print(playerArmor.getTeam()[indexHeroArmor].getName() + " dodged the attack\n\n");
        }

        playerArmor.getTeam()[indexHeroArmor].setIsSpecialAbility(false);
        playerAttack.getTeam()[indexHeroAttack].setIsSpecialAbility(false);

        if (playerArmor.getTeam()[indexHeroArmor].getHealth() <= 0) {
            System.out.println(playerArmor.getUser() + " lost " + playerArmor.getTeam()[indexHeroArmor].getName() + "\n");

            playerArmor.setTeamAfterLose(indexHeroArmor);
        }
    }

    public boolean isGameEnd(Player player) {
        for (Hero aHero : player.getTeam()) {
            if (aHero != null) {
                return false;
            }
        }
        return true;
    }

    private boolean runRound(Player playerAttack, Player playerArmor, boolean isGameEnd) {
        stepFight(playerAttack, playerArmor);
        if (isGameEnd(playerArmor)) {
            isGameEnd = true;
            System.out.println();
            System.out.println(playerAttack.getUser() + " won!");
        }
        return isGameEnd;
    }

    public void run() {
        startGame();
        Player user = new Player();
        Player comp = new Player();

        user.teamSize();
        comp.setComputer();
        comp.initializationTeamForNextUser(user);
        user.setTeam();
        comp.setTeam();

        boolean isGameEnd = false;

        while (!isGameEnd) {
            isGameEnd = runRound(user, comp, isGameEnd);
            if (isGameEnd) {
                continue;
            }
            isGameEnd = runRound(comp, user, isGameEnd);
        }
    }
}
