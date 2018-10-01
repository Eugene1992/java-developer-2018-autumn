package java_essential.homeworks.homework02;
import java.util.Random;


/**
 * Клас Orc позволяет создавать обьекты типа Orc/
 * Уникальная особенность орков это возможность уклониться от удара противника.
 * Вероятность уклонения определяет переменная dodgeAttackChance.
 */

public class Orc extends Hero {
    private double dodgeAttackChance = 0.2;

    public Orc(String name) {
        super(name, 280, 80, 25);
    }


    /**
     * Переопределенный для орка метод сообщающий удалось ли персонажу уклониться
     * от удара
     */
    @Override
    public boolean isDodge() {
        Random rand = new Random();
        int k = rand.nextInt(100) + 1;
        if (k > 0 && k < dodgeAttackChance * 100) {
            System.out.println(name + "уклонился от удара.");
            return true;
        }
        return false;
    }

    /**
     * Переопределенный для орка метод получения имени и расы персонажа
     */
    @Override
    public String toStringNameAndRace() {
        String result = "Орк " + name;
        return result;
    }

    /**
     * Переопределенный для орка метод получения всей информации про персонажа
     */
    @Override
    public String toString() {
        String res = "Орк " + name + super.toString();
        return res;
    }
}
