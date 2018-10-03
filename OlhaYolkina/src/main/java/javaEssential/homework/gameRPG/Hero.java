package javaEssential.homework.gameRPG;

import java.util.Random;

public class Hero {
    protected final String name;
    protected int health;
    protected int attack;
    protected double armor;
    protected boolean isSpecialAbility;

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

    protected boolean checkIfSpecialAbility(int chance) {
        return random.nextInt(chance) == chance - 1;
    }

    protected Hero setIfSpecialAbility() {
        return this;
    }

    protected Hero applySpecialAbility(Hero heroAttack, Hero heroArmor) {
        boolean heroAttackSpecialAbility = heroAttack.setIfSpecialAbility().isSpecialAbility;
        boolean heroArmorSpecialAbility = heroArmor.setIfSpecialAbility().isSpecialAbility;

        return heroArmor;
    }
}
