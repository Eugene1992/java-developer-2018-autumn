package arenaBattle;

import java.util.Scanner;

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
	
	public Elf (Scanner scan) {
		System.out.println("Input name for your elf");
		String name = scan.next();
		this.sethealth(80);
		this.setattackh(25);
		this.setarmor(10);
		this.criticalAttackChance = 25;
		this.criticalAttackMultiplier = 2;
	}
}
