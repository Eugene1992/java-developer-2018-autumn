package arenaBattle;

import java.util.Scanner;

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
	
	public Human (Scanner scan) {
		System.out.println("Input name for your human");
		String name = scan.next();
		this.setname(name);
		this.sethealth(100);
		this.setattackh(20);
		this.setarmor(15);
		this.healingChance = 30;
		this.healthPercent = 50;
	}
}
