package java_essential.home_work02;

public class Hero {
    protected String name;
    protected int health;
    protected int attack;
    protected int armor;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int attackMethods(Hero[] squadForAttack, Hero[] squadToAttack, int numberHeroForAttack, int numberPlayerHeroToAttack) {
        int damage = squadForAttack[numberHeroForAttack].getAttack() - squadToAttack[numberPlayerHeroToAttack].getArmor();
        System.out.println(squadForAttack[numberHeroForAttack].getName() + " damaged " + damage);
        return damage;
    }

    public int defenceMethods(Hero[] squadForAttack, Hero[] squadToAttack, int numberHeroForAttack, int numberPlayerHeroToAttack, int damage) {
        int newHealth = squadToAttack[numberPlayerHeroToAttack].health - damage;
        squadToAttack[numberPlayerHeroToAttack].setHealth(newHealth);
        return newHealth;
    }

}
