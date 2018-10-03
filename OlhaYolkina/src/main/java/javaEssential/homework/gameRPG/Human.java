package javaEssential.homework.gameRPG;

public class Human extends Hero {
    private final double healthingChance = 0.25;
    private final double healthPercent = 0.3;
    private final String specialAbility = "Health restore";

    public Human(String name) {
        super(name);
        this.health = 300 + random.nextInt(51);
        this.armor = 0.1 * random.nextInt(41);
        this.attack = 20 + random.nextInt(21);
    }

    public double getHealthingChance() {
        return healthingChance;
    }

    public double getHealthPercent() {
        return healthPercent;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }
}
