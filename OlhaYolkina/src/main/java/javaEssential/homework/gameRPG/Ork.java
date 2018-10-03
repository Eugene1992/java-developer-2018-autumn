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
}
