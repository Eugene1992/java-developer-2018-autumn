package java_essential.homeworks.homework02;

import java.util.Random;

public class Human extends Hero {
    private double healingChance = 0.20;
    private double healthPercent = 0.05;


    public Human(String name) {
        super(name, 300, 100, 30);
    }


    public int healAfterAttack() {
        Random rand = new Random();
        int k = rand.nextInt(100) + 1;
        if (k > 0 && k < healingChance * 100) {
            health += 300 * healthPercent;
        }
        if (health > 300) {
            health = 300;
        }
        return health;
    }

    @Override
    public int getAttackPower() {
        healAfterAttack();
        return super.getAttackPower();
    }

    @Override
    public String toString() {
        String result = "Человек " + name + "[health: " + health + "]";
        return result;
    }
}
