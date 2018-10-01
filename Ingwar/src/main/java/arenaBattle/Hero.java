package arenaBattle;

class Hero {
	private String name;
	private int health;
	private int attack;
	private int armor;
	private boolean isAlive;
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getname() {
		return this.name;
	}
	
	public void sethealth(int health) {
		this.health = health;
	}
	
	public int gethealth() {
		return this.health;
	}
	
	public void setattackh(int attack) {
		this.attack = attack;
	}
	
	public int getattack() {
		return this.attack;
	}
	
	public void setarmor(int armor) {
		this.armor = armor;
	}
	
	public int getarmor() {
		return this.armor;
	}
	
	public String battleCry() {
		return("Blood and souls!");
	}
	
	public String deathCry() {
		return("My soul goes into the Great Void!");
	}
	
	public Hero() {
		this.isAlive = true;
	}
	
	public void setisAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public boolean getisAlive() {
		return this.isAlive;
	}
	
	public String getrace() {
		return "";
	}

    public int calculateAttack() {
        return this.getattack();
    }

    public int calculateDefence(int attack) {
        return attack - this.getarmor();
    }

    public int calculateHealing(int attack) {
        return 0;
    }
}
