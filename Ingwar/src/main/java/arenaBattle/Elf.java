package arenaBattle;

import java.util.Scanner;
import java.util.Random;

class Elf extends Hero{
	private final String race = "Elf";
	private int criticalAttackChance;
	private int criticalAttackMultiplier;
	
	public String getrace() {
		return this.race;
	}
	
	public String battleCry() {
		return ("Death to all who oppose me!");
	}
	
	public String deathCry() {
		return("My life for Aijur!");
	}
	
	private void setcriticalAttackChance(int criticalAttackChance) {
		this.criticalAttackChance = criticalAttackChance;
	}
	
	private int getcriticalAttackChance() {
		return this.criticalAttackChance;
	}
	
	private void setcriticalAttackMultiplier(int criticalAttackMultiplier) {
		this.criticalAttackMultiplier = criticalAttackMultiplier;
	}
	
	private int getcriticalAttackMultiplier() {
		return this.criticalAttackMultiplier;
	}

    public Elf(Scanner scan, boolean isPc) {
        if (!isPc) {
            System.out.println("Input name for your elf");
            String name = scan.next();
            this.setname(name);
        }
		this.sethealth(80);
		this.setattackh(25);
		this.setarmor(10);
		this.criticalAttackChance = 25;
		this.criticalAttackMultiplier = 2;
	}

    public int calculateAttack() {
        int criticalChance = new Random().nextInt(100);
        if (criticalChance < this.criticalAttackChance) {
            System.out.println(((this.getname() != null) ? this.getname() : "Enemy " + this.getrace()) + " delivers mighty blow!");
            return this.getattack() * 2;
        } else {
            return this.getattack();
        }
    }
}
