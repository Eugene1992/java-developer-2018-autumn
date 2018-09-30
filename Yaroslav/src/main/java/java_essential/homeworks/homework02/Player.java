package java_essential.homeworks.homework02;

import java.util.Random;
import java.util.Scanner;


public class Player {
    private Hero[] heroes;
    private boolean isComputer;
    private boolean isWon = false;

    public Player(int squadSize, boolean isComputer) {
        this.heroes = new Hero[squadSize];
        this.isComputer = isComputer;
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    public int getSquadSize() {
        return heroes.length;
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

    public void reformSquad() {
        if (heroes.length == 1) {
            Hero[] newHeroes = new Hero[0];
            heroes = newHeroes;
        } else {
            Hero[] newHeroes = new Hero[heroes.length - 1];
            int counter = 0;
            for (Hero hero : heroes) {
                if (hero.getName() != null) {
                    newHeroes[counter] = hero;
                    counter++;
                }
            }
            heroes = newHeroes;
        }
    }

    public void dieIfNoHealth(Hero hero) {
        if (hero.getHealth() == 0) {
            System.out.println(hero.toStringNameAndRace() + " погибает.");
            hero.setName(null);
        }
    }

    public boolean checkIfSquadIsDead() {
        for (Hero hero : heroes) {
            if (hero.getName() != null) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfSquadHasFallen() {
        for (Hero hero : heroes) {
            if (hero.getName() == null) {
                return true;
            }
        }
        return false;
    }

    public void heroAttackHero(Hero attacker, Hero defender) {
        int attackPower = attacker.getAttackPower();
        System.out.print(attacker.toStringNameAndRace() + " наносит урон " + attackPower);
        System.out.print(".Здоровье " + defender.toStringNameAndRace() + " падает с " + defender.getHealth());
        int newHealth = defender.getHealth() + defender.getArmor() - attackPower;
        defender.setHealth(newHealth);
        System.out.println(" до " + defender.getHealth());
        if (defender.getHealth() <= 0) {
            dieIfNoHealth(defender);
        }
    }

    public void playerHeroAttack(Hero personHero, Player computer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ходит ваш герой " + personHero.toStringNameAndRace());
        int enemyNum;
        while (true) {
            computer.outputSquadInformation();
            System.out.print("Введите номер врага, которого хотите атаковать: ");
            enemyNum = sc.nextInt() - 1;
            if (enemyNum < 0 || enemyNum > computer.getHeroes().length) {
                System.out.println("Вы вибрали неверный номер. Повторите ввод.");
            } else if (computer.getHeroes()[enemyNum] != null) {
                break;
            } else {
                System.out.println("Вы выбрали убитого врага. Повторите ввод");
            }
        }
        heroAttackHero(personHero, computer.getHeroes()[enemyNum]);
        if (computer.checkIfSquadHasFallen()) {
            computer.reformSquad();
        }
    }

    public void computerHeroAttack(Hero computerHero, Player person) {
        Random rand = new Random();
        System.out.println("Ходит герой врага " + computerHero.toStringNameAndRace());
        int yourNum;
        while (true) {
            yourNum = rand.nextInt(person.getHeroes().length);
            if (person.getHeroes()[yourNum] != null) {
                break;
            }
        }
        heroAttackHero(computerHero, person.getHeroes()[yourNum]);
        if (person.checkIfSquadHasFallen()) {
            person.reformSquad();
        }
        outputSquadInformation();
    }

    public void round(Player person, Player computer) {
        int personHeroCounter = 0;
        int computerHeroCounter = 0;
        while (computerHeroCounter < computer.getHeroes().length && personHeroCounter < person.getHeroes().length) {
            if (computer.getHeroes().length == 0) {
                person.isWon = true;
                break;
            }
            System.out.println("\nВАШ ХОД ");
            if (personHeroCounter < person.getHeroes().length & person.getHeroes()[personHeroCounter].getName() != null) {
                Hero hero = person.getHeroes()[personHeroCounter];
                playerHeroAttack(hero, computer);
                if (person.getHeroes().length > 1) {
                    personHeroCounter++;
                }
            }
            if (person.getHeroes().length == 0) {
                computer.isWon = true;
                break;
            }
            System.out.println("\nХОД ВРАГА");
            if (computerHeroCounter < computer.getHeroes().length && computer.getHeroes()[computerHeroCounter].getName() != null) {
                Hero hero = computer.getHeroes()[computerHeroCounter];
                computerHeroAttack(hero, person);
                if (computer.getHeroes().length > 1) {
                    computerHeroCounter++;
                }
            }
        }
    }

    public void fight(Player person, Player computer) {
        System.out.println("НАЧАЛО БОЯ!!");
        int roundCounter = 1;
        while (true) {
            if (person.getSquadSize() == 0) {
                System.out.println("Ваш отряд убит.Вы проиграли!!!!!");
                break;
            }
            if (computer.getSquadSize() == 0) {
                System.out.println("Отряд врага уничтожен.Вы победили!!!!!!");
                break;
            }
            System.out.println("РАУНД № " + roundCounter);
            round(person, computer);
            roundCounter++;
        }
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


