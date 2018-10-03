package java_essential.home_work02;

public class Human extends Hero {
    private static final double HEALINGCHANCE = 0.35;
    private static final double HEALINGPERCENT = 0.15;
    int firstHealth = health;

    public Human(String name) {
        super(name);
        health = MethodsForHelp.getRundomNumber(250, 350);
        attack = MethodsForHelp.getRundomNumber(75, 125);
        armor = MethodsForHelp.getRundomNumber(20, 50);
    }

    //    метод для использования лечения
    public int getHealthAbility(int firstHealth, int health) {
        if (health < firstHealth) {
            if (Math.random() <= HEALINGCHANCE) {
                health *= HEALINGPERCENT;
                if (health > firstHealth) {
                    health = firstHealth;
                } else {
                    return health;
                }
            }
        }
        return health;
    }

    public int getFirstHealth() {
        return firstHealth;
    }

}

