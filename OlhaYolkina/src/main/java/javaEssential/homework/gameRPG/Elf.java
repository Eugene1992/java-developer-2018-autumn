package javaEssential.homework.gameRPG;

public class Elf extends Hero {
    private final double criticalAttackChance = 0.25;
    private final double criticalAttackMultiplier = 0.25;

    public Elf(String name) {
        super(name);
        this.health = 250 + random.nextInt(101);
        this.armor = 0.1 * random.nextInt(3);
        this.attack = 40 + random.nextInt(21);
        this.specialAbility = "Increased attack";
    }

    public double getCriticalAttackChance() {
        return criticalAttackChance;
    }

    public double getCriticalAttackMultiplier() {
        return criticalAttackMultiplier;
    }

    @Override
    protected void setIfSpecialAbility() {
        int chance = (int) (1 / this.getCriticalAttackChance());
        this.setIsSpecialAbility(checkIfSpecialAbility(chance));
    }

    @Override
    protected double applySpecialAbilityHeroAttack() {
        System.out.println("Special ability " + specialAbility);
        return criticalAttackMultiplier;
    }

    @Override
    protected double applySpecialAbilityHeroArmor() {
        return 1;
    }
}
