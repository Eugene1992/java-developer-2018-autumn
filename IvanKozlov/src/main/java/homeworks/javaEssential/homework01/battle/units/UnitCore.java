package homeworks.javaEssential.homework01.battle.units;

import homeworks.javaEssential.homework01.battle.utils.Messages;
import homeworks.javaEssential.homework01.battle.utils.Random;
import homeworks.javaEssential.homework01.battle.utils.UserInputScanner;

public abstract class UnitCore {

    private String name;
    private String race;

    private int health;
    private int currentHealth;
    private int armor;
    private int attack;

    private int initiative;

    protected int specialAbilityChance;
    protected int specialAbilityPercent;

    private boolean isDead = false;

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getUnitName() {
        System.out.println(Messages.CHOOSE_UNIT_NAME_MESSAGE.getMessage());
        return UserInputScanner.getUserInputString();
    }

    public void attack(UnitCore unit) {
//        todo
        unit.setHealth(unit.getHealth() - this.getAttack());
    }

    public boolean checkIfSpecialAbilityActivates() {
        boolean specialAbilityActivates = false;

        if(specialAbilityChance > Random.getRandomNumberInRange(1)) {
            specialAbilityActivates = true;
        }

        return specialAbilityActivates;
    }

    public abstract int useSpecialAbility();

    public UnitCore() {
        this.setName(getUnitName());
        this.setDead(false);
    }
}
