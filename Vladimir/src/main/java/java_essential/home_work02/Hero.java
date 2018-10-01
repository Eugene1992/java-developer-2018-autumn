package java_essential.home_work02;

public class Hero {
    String name;
    int health;
    int attack;
    int armor;

    public Hero(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health = (int) (Math.random() * 400) + 100;
        this.attack = attack = (int) (Math.random() * 100) + 50;
        this.armor = armor = (int) (Math.random() * 50);
    }


}
