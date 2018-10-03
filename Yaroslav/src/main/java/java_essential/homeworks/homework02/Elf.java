package java_essential.homeworks.homework02;

import java.util.Random;

/**
 * Клас Elf позволяет создавать обьекты типа Elf
 * Уникальная особенность эльфов это возможность нанести критический удар.
 * Вероятность критического удара определяет константа CRITICAL_ATTACK_CHANCE,
 * а силу критического удара по отношению к обычному определяет константа
 * CRITICAL_ATTACK_MULTIPLIER.
 */

public class Elf extends Hero {
    private static final int DEFAULT_ELF_HEALTH = 250;
    private static final int DEFAULT_ELF_ATTACK = 75;
    private static final int DEFAULT_ELF_ARMOUR = 15;

    private static final double CRITICAL_ATTACK_MULTIPLIER = 0.2;
    private static final double CRITICAL_ATTACK_CHANCE = 2;

    public Elf(String name) {
        super(name, DEFAULT_ELF_HEALTH, DEFAULT_ELF_ATTACK, DEFAULT_ELF_ARMOUR);
    }


    /**
     * Переопределенный для эльфа метод получения атаки персонажа
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
     * Переопределенный для эльфа метод получения имени и расы персонажа
     */
    @Override
    public String toStringNameAndRace() {
        return "Эльф " + name;
    }

    /**
     * Переопределенный для эльфа метод получения всей информации про персонажа
     */
    @Override
    public String toString() {
        return "Эльф " + name + super.toString();
    }
}
