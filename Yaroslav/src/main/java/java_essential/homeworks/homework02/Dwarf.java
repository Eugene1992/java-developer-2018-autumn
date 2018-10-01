package java_essential.homeworks.homework02;

import java.util.Random;

/**
 * Клас Dwarf позволяет создавать обьекты типа Dwarf
 * Уникальная особенность гномов это способность частично блокировать урон.
 * Вероятность блокировки урона определяет переменная blockChance, а часть
 * заблокировного урона от общего определяет переменная blockPercent
 */


public class Dwarf extends Hero {
    private double blockChance = 0.30;
    private double blockPercent = 0.35;


    public Dwarf(String name) {
        super(name, 300, 65, 40);
    }


    /**
     * Переопределенный для гнома метод для получения атаки врага после частичной
     * блокировки этой атаки
     */
    @Override
    public int getAttackAfterBlock(int attack) {
        Random rand = new Random();
        int k = rand.nextInt(100) + 1;
        if (k > 0 && k < blockChance * 100) {
            System.out.println(name + " блокирует " + (attack * blockPercent) + " урона.");
            attack *= (1 - blockPercent);
        }
        return attack;
    }


    /**
     * Переопределенный для гнома метод получения имени и расы
     */
    @Override
    public String toStringNameAndRace() {
        String result = "Гном " + name;
        return result;
    }


    /**
     * Переопределенный для гнома метод получения всей информации про персонажа
     */
    @Override
    public String toString() {
        String res = "Гном " + name + super.toString();
        return res;
    }
}
