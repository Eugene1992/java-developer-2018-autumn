package javaEssential.homework.gameRPG;

public class Dwarf extends Hero {
    private final double blockChance = 0.25;
    private final double blockPercent = 0.4;

    public Dwarf(String name) {
        super(name);
        this.health = 200 + random.nextInt(51);
        this.armor = 0.1 * random.nextInt(6);
        this.attack = 20 + random.nextInt(21);
        this.specialAbility = "Attack blocking";
    }

    public double getBlockChance() {
        return blockChance;
    }

    public double getBlockPercent() {
        return blockPercent;
    }

    @Override
    protected void setIfSpecialAbility() {
        int chance = (int) (this.getBlockChance() * 100);
        this.setIsSpecialAbility(checkIfSpecialAbility(chance));
    }

    @Override
    protected double applySpecialAbilityHeroAttack() {
        return 1;
    }

    @Override
    protected double applySpecialAbilityHeroArmor() {
        System.out.println("Special ability " + specialAbility);
        return blockPercent;
    }
}
