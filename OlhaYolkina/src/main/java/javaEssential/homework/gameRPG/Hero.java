package javaEssential.homework.gameRPG;

import java.util.Random;

public class Hero {
    protected final String name;
    protected int health;
    protected int attack;
    protected double armor;
    protected boolean isSpecialAbility;

    protected Random random;

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

    private boolean checkIfSpecialAbility(int chance) {
        return random.nextInt(chance) == chance - 1 ? true : false;
    }

    private Hero setIfSpecialAbility() {
        int chance = 0;
        if (this instanceof Ork) {
            Ork ork = (Ork) this;
            chance = (int) ork.getDodgeAttackChance() * 100;
        }
        if (this instanceof Elf) {
            Elf elf = (Elf) this;
            chance = (int) elf.getCriticalAttackChance() * 100;
        }
        if (this instanceof Human) {
            Human human = (Human) this;
            chance = (int) human.getHealthingChance() * 100;
        }
        if (this instanceof Dwarf) {
            Dwarf dwarf = (Dwarf) this;
            chance = (int) dwarf.getBlockChance() * 100;
        }
        this.setIsSpecialAbility(checkIfSpecialAbility(chance));
        return this;
    }

    protected Hero applySpecialAbility(Hero heroAttack, Hero heroArmor) {
        boolean heroAttackSpecialAbility = heroAttack.setIfSpecialAbility().isSpecialAbility;
        boolean heroArmorSpecialAbility = heroArmor.setIfSpecialAbility().isSpecialAbility;

        return heroArmor;
    }
}
