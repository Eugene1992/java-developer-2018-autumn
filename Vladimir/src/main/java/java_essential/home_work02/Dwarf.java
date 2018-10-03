package java_essential.home_work02;

public class Dwarf extends Hero {
    private static final double BLOCKCHANCE = 0.2;
    private static final double BLOCKPERCENT = 0.2;

    public Dwarf(String name) {
        super(name);
        health = MethodsForHelp.getRundomNumber(350, 450);
        attack = MethodsForHelp.getRundomNumber(50, 100);
        armor = MethodsForHelp.getRundomNumber(10, 30);
    }

    //    метод для использования умении
    public int getBlock(int attack) {
        if (Math.random() <= BLOCKCHANCE) {
            attack *= BLOCKPERCENT;
            return attack;
        }
        return attack;
    }

    //    метод для приема атаки dwarf
    public int getDwarfLifeAferAttack(int attack) {
        health = health + armor - getBlock(attack);
        return health;
    }

}