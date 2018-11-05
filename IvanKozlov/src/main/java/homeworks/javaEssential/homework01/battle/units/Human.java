package homeworks.javaEssential.homework01.battle.units;

public class Human extends UnitCore{

    @Override
    public int useSpecialAbility() {
            return this.getCurrentHealth() * this.specialAbilityPercent;
    }

    public Human() {
        this.setRace(this.getClass().getName());
        this.setHealth(150);
        this.setArmor(10);
        this.setAttack(50);
        this.setInitiative(5);
    }
}
