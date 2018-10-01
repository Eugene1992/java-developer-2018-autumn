package java_essential.homeworks.homework02;

public class Dwarf extends Hero {
    private double blockChance = 0.30;
    private double blockPercent = 0.35;


    public Dwarf(String name) {
        super(name, 310, 60, 40);
    }

    @Override
    public String toStringNameAndRace() {
        String result = "Гном " + name;
        return result;
    }


    @Override
    public String toString() {
        String res = "Гном " + name + super.toString();
        return res;
    }
}
