package java_essential.homeworks.homework02;


/**
 * Клас Hero это родительский клас для класов всех рас. Обьекты этого класа имеют
 * поля имени, здоровья, брони и атаки. Также он имеет реализованые и не реализованые
 * методы, часть из которых потом наследуют некоторые его наследники.
 */

public class Hero {

    protected String name;
    protected int health;
    protected int attack;
    protected int armor;


    public Hero(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }

    /**
     * Метод для получения имени персонажа
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для изменения имени персонажа
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Метод для получения здоровья персонажа */
    public int getHealth() {
        if (health < 0) {
            health = 0;
        }
        return health;
    }

    /** Метод для изменения здоровья персонажа */
    public void setHealth(int health) {
        this.health = health;
    }

    /** Метод для получения брони персонажа */
    public int getArmor() {
        return armor;
    }

    /** Метод для изменения брони персонажа */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    /**
     * Метод для получения атаки персонажа(будет пеореопределен)
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Метод для получения брони противника после ее поломки(будет пеореопределен)
     */
    public int getArmorAfterDestruction(int armor) {
        return armor;
    }

    /**
     * Метод сообщающий удалось ли персонажу уклониться от удара(будет пеореопределен)
     */
    public boolean isDodge() {
        return false;
    }

    /**
     * Метод для получения атаки врага после частичной блокировки этой атаки(будет пеореопределен)
     */
    public int getAttackAfterBlock(int attack) {
        return attack;
    }

    /** Метод для вывода рассы и имени(будет пеореопределен) */
    public String toStringNameAndRace() {
        return "";
    }

    /**
     * Метод для возрождения персонажа(будет пеореопределен)
     */
    public void resurrect() {
    }

    /** Метод для вывода информации про персонажа(будет пеореопределен) */
    public String toString() {
        String res = "[health: " + health + ", armor: " + armor + ", attack: " + attack + "]";
        return res;
    }

}
