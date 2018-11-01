package java_essential.home_work02;

public class Ork extends Hero {
    private static final double DODGEATTACKCHANCE = 0.15;

    public Ork(String name) {
        super(name);
        health = MethodsForHelp.getRundomNumber(250, 350);
        attack = MethodsForHelp.getRundomNumber(50, 100);
        armor = MethodsForHelp.getRundomNumber(50, 75);
        int firstHealth = health;
    }

    //    метод для использования способности
    public int getDodgeAttack(int attack) {
        if (Math.random() <= DODGEATTACKCHANCE) {
            attack = 0;
        }
        return attack;
    }

    @Override
    public int defenceMethods(Hero[] squadForAttack, Hero[] squadToAttack, int numberHeroForAttack, int numberPlayerHeroToAttack, int damage) {
        int newHealth = squadToAttack[numberPlayerHeroToAttack].health - getDodgeAttack(damage);
        squadToAttack[numberPlayerHeroToAttack].setHealth(newHealth);
        return newHealth;
    }
}
