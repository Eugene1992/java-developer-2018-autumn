package arenaBattle;

import java.util.Scanner;
import java.util.Random;

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

    public Ork(Scanner scan, boolean isPc) {
        if (!isPc) {
            System.out.println("Input name for your ork");
            String name = scan.next();
            this.setname(name);
        }
		this.sethealth(100);
        this.setattackh(30);
		this.setarmor(15);
        this.dodgeAttackChance = 30;
    }

    public int calculateDefence(int attack) {
        int dodge = new Random().nextInt(100);
        if (dodge < this.dodgeAttackChance) {
            System.out.println(((this.getname() != null) ? this.getname() : "Enemy " + this.getrace()) + " dodges the attack!");
            return 0;
        } else {
            return attack - this.getarmor();
        }
    }
}
