package arenaBattle;

import java.util.Scanner;

class Ork extends Hero{
	private final String race = "Ork";
	private int dodgeAttackChance;
	
	public String getrace() {
		return this.race;
	}
	
	public String battleCry() {
		return ("WAAAAAGH!");
	}
	
	public String deathCry() {
		return("For Gork and Mork!");
	}
	
	private void setdodgeAttackChance(int dodgeAttackChance) {
		this.dodgeAttackChance = dodgeAttackChance;
	}
	
	private int getdodgeAttackChance() {
		return this.dodgeAttackChance;
	}
	
	public Ork (Scanner scan) {
		System.out.println("Input name for your ork");
		String name = scan.next();
		this.sethealth(100);
		this.setattackh(20);
		this.setarmor(15);
		this.dodgeAttackChance = 35;
	}
}
