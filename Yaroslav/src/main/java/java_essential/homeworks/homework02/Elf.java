package java_essential.homeworks.homework02;

import java.util.Random;

/**
 * Клас Elf позволяет создавать обьекты типа Elf
 * Уникальная особенность эльфов это возможность нанести критический удар.
 * Вероятность критического удара определяет переменная criticalAttackChance, а
 * силу критического удара по отношению к обычному определяет переменная
 * criticalAttackMultiplier.
 */

public class Elf extends Hero {

    private double criticalAttackChance = 0.15;
    private double criticalAttackMultiplier = 2;

    public Elf(String name) {
        super(name, 250, 90, 20);
    }


    /**
     * Переопределенный для эльфа метод получения атаки персонажа
     */
    @Override
    public int getAttack() {
        Random rand = new Random();
        int k = rand.nextInt(100) + 1;
        if (k > 0 && k < criticalAttackChance * 100) {
            System.out.println(name + " наносит критический удар");
            attack *= criticalAttackMultiplier;
        }
        return attack;
    }

    /**
     * Переопределенный для эльфа метод получения имени и расы эльфа
     */
    @Override
    public String toStringNameAndRace() {
        String result = "Эльф " + name;
        return result;
    }

    /**
     * Переопределенный для эльфа метод получения всей информации про персонажа
     */
    @Override
    public String toString() {
        String res = "Эльф " + name + super.toString();
        return res;
    }
}
