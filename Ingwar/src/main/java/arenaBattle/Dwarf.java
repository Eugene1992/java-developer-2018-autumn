package arenaBattle;

import java.util.Scanner;
import java.util.Random;

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

    public Dwarf(Scanner scan, boolean isPc) {
        if (!isPc) {
            System.out.println("Input name for your dwarf");
            String name = scan.next();
            this.setname(name);
        }
        this.sethealth(120);
        this.setattackh(20);
		this.setarmor(10);
		this.blockChance = 35;
		this.blockPercent = 50;
	}

    public int calculateDefence(int attack) {
        int block = new Random().nextInt(100);
        if (block < this.blockChance) {
            System.out.println(((this.getname() != null) ? this.getname() : "Enemy " + this.getrace()) + " blocks the attack!");
            return attack * (this.blockPercent / 100) - this.getarmor();
        } else {
            return attack - this.getarmor();
        }
    }
}
