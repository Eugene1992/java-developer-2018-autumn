package homeworks.javaEssential.homework01.battle.units;

public class Dwarf extends UnitCore{

    @Override
    public int useSpecialAbility() {
        return this.specialAbilityPercent;
    }

    public Dwarf() {
        this.setRace(this.getClass().getName());
        this.setHealth(200);
        this.setArmor(5);
        this.setAttack(40);
        this.setInitiative(3);
    }

}
