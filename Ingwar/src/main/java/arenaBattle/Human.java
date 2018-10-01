package arenaBattle;

import java.util.Scanner;
import java.util.Random;

class Human extends Hero{
	private final String race = "Human";
	private int healingChance;
	private int healthPercent;
	
	public String getrace() {
		return this.race;
	}
	
	public String battleCry() {
		return ("For the Emperor!");
	}
	
	public String deathCry() {
		return("Let His grace be with me!");
	}
	
	private void sethealingChance(int healingChance) {
		this.healingChance = healingChance;
	}
	
	private int gethealingChance() {
		return this.healingChance;
	}
	
	private void sethealthPercent(int healthPercent) {
		this.healthPercent = healthPercent;
	}
	
	private int gethealthPercent() {
		return this.healthPercent;
	}

    public Human(Scanner scan, boolean isPc) {
        if (!isPc) {
            System.out.println("Input name for your human");
            String name = scan.next();
            this.setname(name);
        }
		this.sethealth(100);
		this.setattackh(20);
		this.setarmor(15);
		this.healingChance = 30;
		this.healthPercent = 50;
	}

    public int calculateHealing(int attack) {
        int heal = new Random().nextInt(100);
        if (heal < this.healingChance) {
            System.out.println(((this.getname() != null) ? this.getname() : "Enemy " + this.getrace()) + " heals himself!");
            return attack * (this.healthPercent / 100);
        } else {
            return 0;
        }
    }
}
