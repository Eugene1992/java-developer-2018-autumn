package java_essential.homeworks.homework02;

public class Undead extends Hero {
    private double chanceOfPoison = 0.15;
    private double poisonDamage = 20;


    public Undead(String name) {
        super(name, 280, 90, 10);
    }

    @Override
    public String toStringNameAndRace() {
        String result = "Воин нежити " + name;
        return result;
    }

    @Override
    public String toString() {
        String res = "Воин Нежити " + name + super.toString();
        return res;
    }
}
