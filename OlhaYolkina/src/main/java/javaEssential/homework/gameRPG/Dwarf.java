package javaEssential.homework.gameRPG;

public class Dwarf extends Hero{
    private static final double blockChance = 0.25;
    private static final double blockPercent = 0.4;
    private static final String specialAbility = "Attack blocking";

    public Dwarf(String name){
        super(name);
        this.health = 200 + random.nextInt(51);
        this.armor = 0.1 * random.nextInt(51);
        this.attack = 20 + random.nextInt(21);
    }

    public static double getBlockChance(){
        return blockChance;
    }

    public static double getBlockPercent(){
        return blockPercent;
    }

    public static String getSpecialAbility(){
        return specialAbility;
    }
}
