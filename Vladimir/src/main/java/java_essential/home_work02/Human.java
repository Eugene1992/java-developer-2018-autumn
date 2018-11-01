package java_essential.home_work02;

public class Human extends Hero {
    private static final double HEALING_CHANCE = 0.35;
    private static final double HEALINGPERCENT = 0.15;
    private int firstHealth = health;

    public Human(String name) {
        super(name);
        health = MethodsForHelp.getRundomNumber(250, 350);
        attack = MethodsForHelp.getRundomNumber(75, 125);
        armor = MethodsForHelp.getRundomNumber(20, 50);
    }

    //    метод для использования лечения
    public int getHealthAbility(int health) {
        int firstHealth = getFirstHealth();
        if (health < firstHealth) {
            if (Math.random() <= HEALING_CHANCE) {
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

    @Override
    public int defenceMethods(Hero[] squadForAttack, Hero[] squadToAttack, int numberHeroForAttack, int numberPlayerHeroToAttack, int damage) {
        int newHealth = getHealthAbility(squadToAttack[numberPlayerHeroToAttack].health) - damage;
        squadToAttack[numberPlayerHeroToAttack].setHealth(newHealth);
        return newHealth;
    }
}

