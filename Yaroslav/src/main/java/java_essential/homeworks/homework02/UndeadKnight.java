package java_essential.homeworks.homework02;

import java.util.Random;

/**
 * Клас UndeadKnight позволяет создавать обьекты типа UndeadKnight
 * Уникальная особенность рыцаря смерти это способность один раз возродиться с
 * вероятностью, которую определяет resurrectChance.
 * Возрожденный Рыцарь смерти будет слабее первоначального.
 */

public class UndeadKnight extends Hero {
    private double resurrectChance = 0.50;


    public UndeadKnight(String name) {
        super(name, 260, 70, 10);
    }


    /**
     * Переопределенный для рыцаря нежити метод для возрождения персонажа
     */
    public void resurrect() {
        if (health <= 0) {
            Random rand = new Random();
            int k = rand.nextInt(100) + 1;
            if (k > 0 && k < resurrectChance * 100) {
                System.out.println(name + " возродился.");
                armor = 0;
                attack *= 0.5;
                health = 100;
                resurrectChance = 0;
            }
        }
    }


    /**
     * Переопределенный для рыцаря нежити метод получения имени и расы персонажа
     */
    @Override
    public String toStringNameAndRace() {
        String result = "Рыцарь нежити " + name;
        return result;
    }

    /**
     * Переопределенный для рыцаря нежити метод получения всей информации про персонажа
     */
    @Override
    public String toString() {
        String res = "Рыцарь Нежити " + name + super.toString();
        return res;
    }
}
