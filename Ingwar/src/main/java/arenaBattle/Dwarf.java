package arenaBattle;

import java.util.Scanner;

class Dwarf extends Hero{
	private final String race = "Dwarf";
	private int blockChance;
	private int blockPercent;
	
	public String getrace() {
		return this.race;
	}
	
	public String battleCry() {
		return ("Barukh khazad!");
	}
	
	public String deathCry() {
		return("Makhal moni, take my soul to the etrnal smithy of yours!");
	}
	
	private void setblockChance(int blockChance) {
		this.blockChance = blockChance;
	}
	
	private int getblockChance() {
		return this.blockChance;
	}
	
	private void setblockPercent(int blockPercent) {
		this.blockPercent = blockPercent;
	}
	
	private int getblockPercent() {
		return this.blockPercent;
	}
	
	public Dwarf (Scanner scan) {
		System.out.println("Input name for your dwarf");
		String name = scan.next();
		this.sethealth(80);
		this.setattackh(25);
		this.setarmor(10);
		this.blockChance = 35;
		this.blockPercent = 50;
	}
}
