package javaEssential.homework.gameRPG;

public class Human extends Hero {
    private final double healthingChance = 0.25;
    private final double healthPercent = 0.3;

    public Human(String name) {
        super(name);
        this.health = 300 + random.nextInt(51);
        this.armor = 0.1 * random.nextInt(5);
        this.attack = 20 + random.nextInt(21);
        this.specialAbility = "Health restore";
    }

    public double getHealthingChance() {
        return healthingChance;
    }

    public double getHealthPercent() {
        return healthPercent;
    }

    @Override
    protected void setIfSpecialAbility() {
        int chance = (int) (this.getHealthingChance() * 100);
        this.setIsSpecialAbility(checkIfSpecialAbility(chance));
    }

    @Override
    protected double applySpecialAbilityHeroAttack() {
        System.out.println("Special ability " + specialAbility);
        return healthPercent;
    }

    @Override
    protected double applySpecialAbilityHeroArmor() {
        return 1;
    }
}
