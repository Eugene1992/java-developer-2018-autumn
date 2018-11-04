package homeworks.javaEssential.homework01.battle.units;

public class Orc extends UnitCore{

    @Override
    public int useSpecialAbility() {
        return 0;
    }

    public Orc() {
        this.setRace(this.getClass().getName());
        this.setHealth(80);
        this.setArmor(5);
        this.setAttack(70);
        this.setInitiative(8);
    }
}
