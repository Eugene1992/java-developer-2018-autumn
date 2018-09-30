package java_essential.homeworks.homework02;

import java.util.Random;
import java.util.Scanner;


public class Player {
    private Hero[] heroes;
    private int squadSize;
    private boolean isComputer;

    public Player(int squadSize, boolean isComputer) {
        this.heroes = new Hero[squadSize];
        this.squadSize = squadSize;
        this.isComputer = isComputer;
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    public Hero addHeroForPerson() {
        Scanner sc = new Scanner(System.in);
        Hero hero = null;
        System.out.println("Выберите расу воина: ");
        System.out.println("1 - человек, 2 - єльф");
        int raceNumber = sc.nextInt();
        System.out.println("Дайте воину имя: ");
        String name = sc.next();
        switch (raceNumber) {
            case 1:
                hero = new Human(name);
                break;
            case 2:
                hero = new Elf(name);
                break;
        }
        return hero;
    }

    public Hero addHeroForComputer() {
        Random rand = new Random();
        Hero hero = null;
        int raceNumber = rand.nextInt(2) + 1;
        switch (raceNumber) {
            case 1:
                String name = Constants.humanNames[rand.nextInt(Constants.humanNames.length)];
                hero = new Human(name);
                break;
            case 2:
                name = Constants.elfNames[rand.nextInt(Constants.elfNames.length)];
                hero = new Elf(name);
                break;
        }
        return hero;
    }

    public Hero addHero() {
        Hero hero;
        if (isComputer) {
            hero = addHeroForComputer();
        } else {
            hero = addHeroForPerson();
        }
        return hero;
    }

    public void addHeroes() {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i] = addHero();
        }
    }


    public void heroAttackHero(Hero attacker, Hero defender) {
        int attackPower = attacker.getAttackPower();
        int newHealth = defender.getHealth() + defender.getArmor() - attackPower;
        defender.setHealth(newHealth);
    }

    public void playerHeroAttack(Hero personHero, Player computer) {
        Scanner sc = new Scanner(System.in);
        int enemyNum;
        while (true) {
            computer.outputSquadInformation();
            System.out.println("Введите номер врага, которого хотите атаковать: ");
            enemyNum = sc.nextInt();
            if (enemyNum < 1 || enemyNum > computer.getHeroes().length) {
                System.out.println("Вы вибрали неверный номер. Повторите ввод.");
            } else if (computer.getHeroes()[enemyNum - 1] != null) {
                break;
            } else {
                System.out.println("Вы выбрали убитого врага. Повторите ввод");
            }
        }
        heroAttackHero(personHero, computer.getHeroes()[enemyNum]);

    }


    public void computerHeroAttack(Hero computerHero, Player person) {
        Random rand = new Random();
        int yourNum;
        while (true) {
            yourNum = rand.nextInt(person.getHeroes().length);
            if (person.getHeroes()[yourNum] != null) {
                break;
            }
        }
        heroAttackHero(computerHero, person.getHeroes()[yourNum]);

    }


    public void fight() {

    }


    public void outputSquadInformation() {
        if (isComputer) {
            System.out.println("Вражеский отряд");
        } else {
            System.out.println("Ваш отряд");
        }
        int counter = 1;
        for (Hero hero : heroes) {
            if (hero != null) {
                System.out.println(counter + ")" + hero.toString());
                counter++;
            }
        }
        System.out.println();
    }
}


