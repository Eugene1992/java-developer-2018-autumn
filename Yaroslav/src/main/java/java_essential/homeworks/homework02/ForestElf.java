package java_essential.homeworks.homework02;

import java.util.Random;

public class ForestElf extends Elf {
    private static final int DEFAULT_FOREST_ELF_HEALTH = 250;
    private static final int DEFAULT_FOREST_ELF_ATTACK = 75;
    private static final int DEFAULT_FOREST_ELF_ARMOR = 15;

    private static final double CRITICAL_ATTACK_MULTIPLIER = 2;
    private static final double CRITICAL_ATTACK_CHANCE = 0.2;

    public ForestElf(String name) {
        super(name, DEFAULT_FOREST_ELF_HEALTH, DEFAULT_FOREST_ELF_ATTACK, DEFAULT_FOREST_ELF_ARMOR);
    }

    /**
     * Переопределенный для лесного эльфа метод получения атаки персонажа
     */
    @Override
    public int getAttack() {
        Random rand = new Random();
        int k = rand.nextInt(100) + 1;
        if (k > 0 && k < CRITICAL_ATTACK_CHANCE * 100) {
            System.out.print(toStringNameAndRace() + " наносит критический удар. ");
            int newAttack = (int) (attack * CRITICAL_ATTACK_MULTIPLIER);
            return newAttack;
        }
        return attack;
    }


    /**
     * Переопределенный для лесного эльфа метод получения имени и расы персонажа
     */
    @Override
    public String toStringNameAndRace() {
        return "Лесной Эльф " + name;
    }

    /**
     * Переопределенный для лесного эльфа метод получения всей информации про персонажа
     */
    @Override
    public String toString() {
        return "Лесной Эльф " + name + super.toString();
    }
}
