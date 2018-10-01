package javaEssential.homework.gameRPG;

import java.util.Random;

public class Hero {
    protected final String name;
    protected int health;
    protected int attack;
    protected int armor;

    protected Random random;

    public Hero(String name){
        this.name = name;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getArmor(){
        return this.armor;
    }

    public int getAttack(){
        return this.attack;
    }
}
