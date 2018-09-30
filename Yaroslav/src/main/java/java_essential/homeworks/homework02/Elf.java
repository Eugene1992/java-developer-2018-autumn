package java_essential.homeworks.homework02;

import java.util.Random;

public class Elf extends Hero {

    private double criticalAttackChance = 0.15;
    private double criticalAttackMultiplier = 2;

    public Elf(String name) {
        super(name, 250, 90, 20);
    }


    @Override
    public int getAttackPower() {
        Random rand = new Random();
        int k = rand.nextInt(100) + 1;
        if (k > 0 && k < criticalAttackChance * 100) {
            attack *= criticalAttackMultiplier;
        }
        return attack;
    }

    @Override
    public String toString() {
        String result = "Эльф " + name + "[health: " + health + "]";
        return result;
    }
}
