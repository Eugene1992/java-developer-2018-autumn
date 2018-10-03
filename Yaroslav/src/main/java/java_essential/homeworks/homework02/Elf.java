package java_essential.homeworks.homework02;


/**
 * Клас Elf позволяет создавать обьекты типа Elf
 * Уникальная особенность эльфов это возможность нанести критический удар.
 * Вероятность критического удара определяет константа CRITICAL_ATTACK_CHANCE,
 * а силу критического удара по отношению к обычному определяет константа
 * CRITICAL_ATTACK_MULTIPLIER.
 */

public abstract class Elf extends Hero {

    public Elf(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);

    }
}
