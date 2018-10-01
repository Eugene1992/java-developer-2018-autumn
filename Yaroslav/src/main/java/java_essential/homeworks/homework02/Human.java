package java_essential.homeworks.homework02;

import java.util.Random;

/**
 * Клас Human позволяет создавать обьекты типа Human
 * Уникальная особенность людей это возможность восстановить часть здоровья перед
 * своим ударом. Вероятность восстановления определяет переменная healingChance, а
 * количество восстанавлиемого здоровья по отношению к всему здоровью определяет
 * переменная healthPercent
 */

public class Human extends Hero {
    private double healingChance = 0.2;
    private double healthPercent = 0.1;


    public Human(String name) {
        super(name, 300, 80, 30);
    }


    public int healAfterAttack() {
        Random rand = new Random();
        int k = rand.nextInt(100) + 1;
        if (k > 0 && k < healingChance * 100) {
            System.out.println(name + " исцеляет " + (300 * healthPercent) + "здоровья");
            health += 300 * healthPercent;
        }
        if (health > 300) {
            health = 300;
        }
        return health;
    }

    @Override
    public int getAttack() {
        healAfterAttack();
        return super.getAttack();
    }


    @Override
    public String toStringNameAndRace() {
        String result = "Человек " + name;
        return result;
    }


    @Override
    public String toString() {
        String res = "Человек " + name + super.toString();
        return res;
    }
}
