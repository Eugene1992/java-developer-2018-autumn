package java_essential.home_work02;

public class Elf extends Hero {
    private static final double CRITICALATTACKCHANCE = 0.10;
    private static final double CRITICALATTACKMULTIPLIER = 2;

    public Elf(String name) {
        super(name);
        health = MethodsForHelp.getRundomNumber(350, 450);
        attack = MethodsForHelp.getRundomNumber(100, 150);
        armor = MethodsForHelp.getRundomNumber(0, 20);
        int firstHealth = health;
    }

    //    метод для использования способности
    public int getCriticalAttack(int attack) {
        if (Math.random() <= CRITICALATTACKCHANCE) {
            attack *= CRITICALATTACKMULTIPLIER;
            return attack;
        }
        return attack;
    }
}
