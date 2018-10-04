package javaEssential.homework.gameRPG;

public class Ork extends Hero {
    private final double dodgeAttackChance = 0.1;

    public Ork(String name) {
        super(name);
        this.health = 200 + random.nextInt(51);
        this.armor = 0.1 * random.nextInt(5);
        this.attack = 50 + random.nextInt(21);
        this.specialAbility = "Dodge attack";
    }

    public double getDodgeAttackChance() {
        return dodgeAttackChance;
    }

    @Override
    protected void setIfSpecialAbility() {
        int chance = (int) (1 / this.getDodgeAttackChance());
        this.setIsSpecialAbility(checkIfSpecialAbility(chance));
    }

    @Override
    protected double applySpecialAbilityHeroAttack() {
        return 1;
    }

    @Override
    protected double applySpecialAbilityHeroArmor() {
        System.out.println("Special ability " + specialAbility);
        return 1;
    }
}
