package javaEssential.homework.gameRPG;

public class Elf extends Hero {
    private final double criticalAttackChance = 0.25;
    private final double criticalAttackMultiplier = 0.25;
    private final String specialAbility = "Increased attack";

    public Elf(String name) {
        super(name);
        this.health = 250 + random.nextInt(101);
        this.armor = 0.1 * random.nextInt(21);
        this.attack = 40 + random.nextInt(21);
    }

    public double getCriticalAttackChance() {
        return criticalAttackChance;
    }

    public double getCriticalAttackMultiplier() {
        return criticalAttackMultiplier;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }
}
