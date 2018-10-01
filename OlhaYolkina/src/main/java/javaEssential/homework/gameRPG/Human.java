package javaEssential.homework.gameRPG;

public class Human extends Hero {
    private static final double healthingChance = 0.25;
    private static final double healthPercent = 0.3;
    private static final String specialAbility = "Health restore";

    public Human(String name) {
        super(name);
        this.health = 300 + random.nextInt(51);
        this.armor = 0.1 * random.nextInt(41);
        this.attack = 20 + random.nextInt(21);
    }

    public static double getHealthingChance() {
        return healthingChance;
    }

    public static double getHealthPercent() {
        return healthPercent;
    }

    public static String getSpecialAbility() {
        return specialAbility;
    }
}
