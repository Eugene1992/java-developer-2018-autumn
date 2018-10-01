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
				this.heroSquad[index] = new Elf(scan);
				break;
			case 1 :
				this.heroSquad[index] = new Dwarf(scan);
				break;
			case 2 :
				this.heroSquad[index] = new Ork(scan);
				break;
			default :
				this.heroSquad[index] = new Human(scan);
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
			switch (race) {
			case 0 :
				this.heroSquad[index] = new Elf(scan);
				break;
			case 1 :
				this.heroSquad[index] = new Dwarf(scan);
				break;
			case 2 :
				this.heroSquad[index] = new Ork(scan);
				break;
			default :
				this.heroSquad[index] = new Human(scan);
			}
		}	
	}
	
	public void strike(Player player, Player[] players) {
		Player enemy = defineEnemy(player, players);
		Hero[] enemySquad = enemy.getheroSquad();		
		
	}
	
	public void strike(Player player, Player[] players, Scanner scan) {
		Player enemy = defineEnemy(player, players);
		Hero[] enemySquad = enemy.getheroSquad();
		System.out.println("Choose your next striker");
		int strikerNumber = 0;
		for (Hero striker : player.heroSquad) {
			if (striker.getisAlive())
			System.out.print("Input "+strikerNumber + "for "+striker.getname()+" the "+striker.getrace()+", ");
		}
		int NumberStriker = scan.nextInt();
		int countIndex = 0;
		for (Hero hero : player.heroSquad) {
			if (countIndex == NumberStriker) {
				
			}
		}
	}
	
	public Player defineEnemy(Player player, Player[] players) {
		for (Player enemy : players) {
			if (enemy != player) {
				return enemy;
			}
		}
		return null;
	}
	
}

