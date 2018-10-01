package arenaBattle;

import java.util.Scanner;
import java.util.Random;

class Player {
	private boolean isPc;
	private Hero[] heroSquad;

	public void setisPc (boolean isPc) {
		this.isPc = isPc;
	}
	
	public boolean getisPc () {
		return this.isPc;
	}
	
	public Hero[] getheroSquad() {
		return this.heroSquad;
	}
	
	public Player(int squadSize, Scanner scan, boolean isPc) {
		this.isPc = isPc;
		Hero[] heroSquad = new Hero[squadSize];
		for(int index = 0; index < squadSize; index++) {
			int race = new Random().nextInt(squadSize);
			switch (race) {
			case 0 :
                heroSquad[index] = new Elf(scan, isPc);
				break;
			case 1 :
                heroSquad[index] = new Dwarf(scan, isPc);
				break;
			case 2 :
                heroSquad[index] = new Ork(scan, isPc);
				break;
			default :
                heroSquad[index] = new Human(scan, isPc);
			}
		}
		this.heroSquad = heroSquad;
	}
	
	public Player(int squadSize, Scanner scan) {
		this.isPc = false;
		Hero[] heroSquad = new Hero[squadSize];
		for(int index = 0; index < squadSize; index++) {
			System.out.println("Input race for your fighter #"+(index+1));
			System.out.println("1 for Elf, 2 for Dwarf, 3 for Ork, 4 for Human");
			int race = scan.nextInt();
            switch (race - 1) {
			case 0 :
                heroSquad[index] = new Elf(scan, this.isPc);
				break;
			case 1 :
                heroSquad[index] = new Dwarf(scan, this.isPc);
				break;
			case 2 :
                heroSquad[index] = new Ork(scan, this.isPc);
				break;
			default :
                heroSquad[index] = new Human(scan, this.isPc);
			}
        }
        this.heroSquad = heroSquad;
	}
	
	public void strike(Player player, Player[] players) {
        Hero striker = null;
        Hero target = null;
		Player enemy = defineEnemy(player, players);
        Hero[] enemySquad = enemy.getheroSquad();
        boolean strikerChosen = false;
        while (!strikerChosen) {
            int heroIndex = new Random().nextInt(player.heroSquad.length);
            if (player.heroSquad[heroIndex].getisAlive()) {
                striker = player.heroSquad[heroIndex];
                strikerChosen = true;
                System.out.println("Enemy " + striker.getrace() + " attacks!");
            }
        }
        boolean enemyChosen = false;
        while (!enemyChosen) {
            int enemyIndex = new Random().nextInt(enemySquad.length);
            if (enemySquad[enemyIndex].getisAlive()) {
                target = enemySquad[enemyIndex];
                enemyChosen = true;
            }
        }
        attack(striker, target);
	}
	
	public void strike(Player player, Player[] players, Scanner scan) {
        Hero striker = null;
        Hero target = null;
		Player enemy = defineEnemy(player, players);
		Hero[] enemySquad = enemy.getheroSquad();
		System.out.println("Choose your next striker");
        boolean strikerChosen = false;
        while (!strikerChosen) {
            for (int heroIndex = 0; heroIndex < player.heroSquad.length; heroIndex++) {
                if (player.heroSquad[heroIndex].getisAlive()) {
                    System.out.print("Input " + heroIndex + " for " + player.heroSquad[heroIndex].getname() +
                            " the " + player.heroSquad[heroIndex].getrace() +
                            ((heroIndex == player.heroSquad.length - 1) ? "" : ", ") + "\n");
                }
            }
            int numberStriker = scan.nextInt();
            if (player.heroSquad[numberStriker].getisAlive()) {
                striker = player.heroSquad[numberStriker];
                strikerChosen = true;
            } else {
                System.out.println("This brave hero is dead, choose another!");
			}
		}
        System.out.println("Choose target for your striker");
        boolean enemyChosen = false;
        while (!enemyChosen) {
            for (int enemyIndex = 0; enemyIndex < enemySquad.length; enemyIndex++) {
                if (enemySquad[enemyIndex].getisAlive()) {
                    System.out.print("Input " + enemyIndex + " for enemy " + enemySquad[enemyIndex].getrace() +
                            ((enemyIndex == enemySquad.length - 1) ? " " : ", ") + "\n");
                }
            }
            int numberEnemy = scan.nextInt();
            if (enemy.heroSquad[numberEnemy].getisAlive()) {
                target = enemy.heroSquad[numberEnemy];
                enemyChosen = true;
            } else {
                System.out.println("This enemy hero is dead, choose another!");
            }
        }
        System.out.println(striker.getname() + " attacks!");
        attack(striker, target);
	}
	
	public Player defineEnemy(Player player, Player[] players) {
		for (Player enemy : players) {
			if (enemy != player) {
				return enemy;
			}
		}
		return null;
	}

    public void attack(Hero striker, Hero target) {
        System.out.println(striker.battleCry());
        int attack = striker.calculateAttack();
        attack = target.calculateDefence(attack);
        int heal = target.calculateHealing(attack);
        int targetHealth = target.gethealth();
        targetHealth = targetHealth - ((attack > 0) ? attack + heal : 0);
        target.sethealth(targetHealth);
        if (targetHealth <= 0) {
            target.setisAlive(false);
            System.out.println(target.deathCry());
            System.out.println(((target.getname() != null) ? target.getname() : "Enemy " + target.getrace()) + " is dead.");
        }

    }

    public void showHealth(Player player) {
        System.out.println("Health of the heroes:");
        for (Hero hero : player.heroSquad) {
            System.out.println(((player.isPc) ? hero.getrace() : hero.getname()) + " is " + hero.gethealth());
        }
    }
}

