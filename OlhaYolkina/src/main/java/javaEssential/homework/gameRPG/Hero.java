package javaEssential.homework.gameRPG;

import java.util.Random;

public class Hero {
    protected final String name;
    protected int health;
    protected int attack;
    protected double armor;
    protected boolean isSpecialAbility;
    protected String specialAbility;

    protected Random random = new Random();

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getArmor() {
        return this.armor;
    }

    public int getAttack() {
        return this.attack;
    }

    public boolean getIsSpecialAbility() {
        return isSpecialAbility;
    }

    public void setIsSpecialAbility(boolean value) {
        this.isSpecialAbility = value;
    }

    public String getSpecialAbility() {
        return this.specialAbility;
    }

    protected boolean checkIfSpecialAbility(int chance) {
        int number = random.nextInt(chance);
        if (number == (chance - 1)) {
            return true;
        } else {
            return false;
        }
    }

    protected void setIfSpecialAbility() {
    }

    protected double applySpecialAbilityHeroAttack() {
        return 1;
    }

    protected double applySpecialAbilityHeroArmor() {
        return 1;
    }
}
