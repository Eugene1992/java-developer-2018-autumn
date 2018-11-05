package homeworks.javaEssential.homework01.battle.units;

public class Elf extends UnitCore{

    @Override
    public int useSpecialAbility() {
        return this.getAttack() * this.specialAbilityPercent;
    }

    public Elf() {
        this.setRace(this.getClass().getName());
        this.setHealth(120);
        this.setArmor(8);
        this.setAttack(60);
        this.setInitiative(6);
    }
}
