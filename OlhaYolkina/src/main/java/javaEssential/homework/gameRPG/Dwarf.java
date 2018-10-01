package javaEssential.homework.gameRPG;

public class Dwarf extends Hero{
    private static double blockChance = 0.25;
    private static double blockPercent = 0.4;

    public Dwarf(String name){
        super(name);
        this.health = 80 + random.nextInt(21);
        this.armor = 80 + random.nextInt(21);
        this.attack = 50 + random.nextInt(31);
    }

    public static double getBlockChance(){
        return blockChance;
    }

    public static double getBlockPercent(){
        return blockPercent;
    }
}
