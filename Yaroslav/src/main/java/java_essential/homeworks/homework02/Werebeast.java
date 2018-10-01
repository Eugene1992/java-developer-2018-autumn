package java_essential.homeworks.homework02;


import java.util.Random;


/**
 * Клас Werebeast позволяет создавать обьекты типа Werebeast
 * Уникальная особенность зверолюдей это возможность во время атаки вызвать у
 * противника кровотечение, которое будет отнимать здоровье противника в течении
 * нескольких раундов. Вероятность вызова кровотечения определяет переменная
 * causeBleedingChance;
 */

public class Werebeast extends Hero {
    private double causeBleedingChance = 0.25;

    public Werebeast(String name) {
        super(name, 270, 70, 10);
    }


    @Override
    public boolean hurtToBleeding(Hero hero) {
        if (Methods.getTrueClassName(hero).equals("UndeadKnight")) {
            return false;
        }
        Random rand = new Random();
        int k = rand.nextInt(100) + 1;
        if (k > 0 && k < causeBleedingChance * 100) {
            System.out.print(name + " вызывает кровотичение у " + hero.toStringNameAndRace() + ". ");
            hero.bleedDamage = 30;
            return true;
        }
        return false;
    }


    /**
     * Переопределенный для зверочеловека метод получения имени и расы персонажа
     */
    @Override
    public String toStringNameAndRace() {
        String result = "Зверочеловек " + name;
        return result;
    }


    /**
     * Переопределенный для зверочеловека метод получения всей информации про персонажа
     */
    @Override
    public String toString() {
        String res = "Зверочеловек " + name + super.toString();
        return res;
    }
}
