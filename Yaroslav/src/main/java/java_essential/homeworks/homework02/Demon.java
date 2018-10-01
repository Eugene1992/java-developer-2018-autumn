package java_essential.homeworks.homework02;


import java.util.Random;


/**
 * Клас Demon позволяет создавать обьекты типа Demon
 * Уникальная особенность демонов это возможность силой пламени сломать броню
 * противника. Вероятность поломки брони определяет переменная armorDestroyChance,
 * а часть разрушеной брони по отношению к всей броне определяет переменная
 * percentOfArmorDestroy
 */

public class Demon extends Hero {
    private double armorDestroyChance = 0.2;
    private double percentOfArmorDestroy = 0.4;

    public Demon(String name) {
        super(name, 320, 80, 20);
    }


    /**
     * Переопределенный для демона метод возвращающий броню противника после
     * ее поломки
     */
    public int getArmorAfterDestruction(int armor) {
        Random rand = new Random();
        int k = rand.nextInt(100) + 1;
        if (k > 0 && k < armorDestroyChance * 100) {
            System.out.print(name + " снижает броню с " + armor + " до ");
            armor *= (1 - percentOfArmorDestroy);
            System.out.println(armor + ".");
        }
        return armor;
    }

    /**
     * Переопределенный для демона метод получения имени и расы персонажа
     */
    @Override
    public String toStringNameAndRace() {
        String result = "Демон " + name;
        return result;
    }


    /**
     * Переопределенный для демона метод получения всей информации про персонажа
     */
    @Override
    public String toString() {
        String res = "Демон " + name + super.toString();
        return res;
    }
}
