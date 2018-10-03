package javaEssential.homework.gameRPG;

public class Ork extends Hero {
    private final double dodgeAttackChance = 0.1;
    private final String specialAbility = "Dodge attack";

    public Ork(String name) {
        super(name);
    }

    public double getDodgeAttackChance() {
        return dodgeAttackChance;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    @Override
    protected Hero setIfSpecialAbility() {
        int chance = (int) this.getDodgeAttackChance() * 100;
        this.setIsSpecialAbility(checkIfSpecialAbility(chance));
        return this;
    }
}
