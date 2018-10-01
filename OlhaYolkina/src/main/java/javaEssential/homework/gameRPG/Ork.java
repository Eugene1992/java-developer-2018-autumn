package javaEssential.homework.gameRPG;

public class Ork extends Hero {
    private static final double dodgeAttackChance = 0.1;
    private static final String specialAbility = "Dodge attack";

    public Ork(String name) {
        super(name);
    }

    public static double getDodgeAttackChance() {
        return dodgeAttackChance;
    }

    public static String getSpecialAbility() {
        return specialAbility;
    }
}
