package javaEssential.homework.gameRPG;

public class Human extends Hero{
    private static double healthingChance = 0.25;
    private static double healthPercent = 0.3;

    public Human(String name){
        super(name);
        this.health = 80 + random.nextInt(21);
        this.armor = 60 + random.nextInt(41);
        this.attack = 70 + random.nextInt(31);
    }

    public static double getHealthingChance(){
        return healthingChance;
    }

    public static double getHealthPercent(){
        return healthPercent;
    }
}
