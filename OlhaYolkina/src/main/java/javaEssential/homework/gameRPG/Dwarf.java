package javaEssential.homework.gameRPG;

public class Dwarf extends Hero {
    private final double blockChance = 0.25;
    private final double blockPercent = 0.4;
    private final String specialAbility = "Attack blocking";

    public Dwarf(String name) {
        super(name);
        this.health = 200 + random.nextInt(51);
        this.armor = 0.1 * random.nextInt(51);
        this.attack = 20 + random.nextInt(21);
    }

    public double getBlockChance() {
        return blockChance;
    }

    public double getBlockPercent() {
        return blockPercent;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }
}
