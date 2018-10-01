package java_essential.homeworks.homework02;

import java.util.Random;
import java.util.Scanner;


/**
 * Клас Player создает игроков.
 * Каждый игрок имеет масив персонажей и булевое поле, которое показывает являеться
 * ли игрок компьютером или человеком-игроком.
 * В этом класе также содержиться мнжество методов необходимых для игры(создание
 * персоажей компьютером и человком, атака персонажами друг друга и т.д)
 * Ниже будут коментарии к каждому методу.
 */

public class Player {
    private Hero[] heroes;
    private boolean isComputer;

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

    /**
     * Метод, снижающий броню защищаегося воина
     */
    public void armorDestruct(Hero attacker, Hero defender) {
        if (Methods.getTrueClassName(attacker).equals("Demon")) {
            defender.setArmor(attacker.getArmorAfterDestruction(defender.getArmor()));
        }
    }

    /**
     * Метод, возвращающий true если персонаж увернулся от удара
     */
    public boolean dodgeFromAttack(Hero defender) {
        if (Methods.getTrueClassName(defender).equals("Orc")) {
            return defender.isDodge();
        }
        return false;
    }

    /**
     * Метод, возвращающий атаку после блокировки
     */
    public int getEnemyAttackAfterBlock(Hero attacker, Hero defender) {
        int attackPower = attacker.getAttack();
        if (Methods.getTrueClassName(defender).equals("Dwarf")) {
            attackPower = defender.getAttackAfterBlock(attackPower);
        }
        return attackPower;
    }

    /**
     * Метод, возвращающий true если атакующий вызвал кровотичение у защищаегося
     */
    public void hurtToBleeding(Hero attacker, Hero defender) {
        if (Methods.getTrueClassName(attacker).equals("Werebeast")) {
            attacker.hurtToBleeding(defender);
        }
    }


    /**Метод, возвращаюший персонажа созданого человеком */
    public Hero addHeroForPerson() {
        Scanner sc = new Scanner(System.in);
        Hero hero = null;
        while (true) {
            System.out.println("Выберите расу воина: ");
            for (int i = 0; i < Constants.races.length; i++) {
                System.out.print((i + 1) + " - " + Constants.races[i] + ", ");
            }
            int raceNumber = Methods.inputParameter(0, Constants.races.length);
            System.out.println("Дайте воину имя: ");
            String name = sc.next();
            switch (raceNumber) {
                case 1:
                    hero = new Human(name);
                    break;
                case 2:
                    hero = new Elf(name);
                    break;
                case 3:
                    hero = new Dwarf(name);
                    break;
                case 4:
                    hero = new Orc(name);
                    break;
                case 5:
                    hero = new Demon(name);
                    break;
                case 6:
                    hero = new UndeadKnight(name);
                    break;
                case 7:
                    hero = new Werebeast(name);
                    break;
            }
            if (hero == null) {
                System.out.println("Такого номера расы нет.Повторите ввод.");
            } else {
                break;
            }
        }
        return hero;
    }

    /**Метод, возвращаюший персонажа созданого компьютером */
    public Hero addHeroForComputer() {
        Random rand = new Random();
        Hero hero = null;
        while (true) {
            int raceNumber = rand.nextInt(6) + 1;
            switch (raceNumber) {
                case 1:
                    String name = Methods.getRandomHeroNameFromArray(Constants.humanNames);
                    hero = new Human(name);
                    break;
                case 2:
                    name = Methods.getRandomHeroNameFromArray(Constants.elfNames);
                    hero = new Elf(name);
                    break;
                case 3:
                    name = Methods.getRandomHeroNameFromArray(Constants.dwarfNames);
                    hero = new Dwarf(name);
                    break;
                case 4:
                    name = Methods.getRandomHeroNameFromArray(Constants.orcNames);
                    hero = new Orc(name);
                    break;
                case 5:
                    name = Methods.getRandomHeroNameFromArray(Constants.demonNames);
                    hero = new Demon(name);
                    break;
                case 6:
                    name = Methods.getRandomHeroNameFromArray(Constants.undeadNames);
                    hero = new UndeadKnight(name);
                    break;
                case 7:
                    name = Methods.getRandomHeroNameFromArray(Constants.werebeastNames);
                    hero = new Werebeast(name);
                    break;
            }
            if (hero != null) {
                break;
            }
        }
        return hero;
    }

    /**Метод, возвращаюший персонажа созданого человеком или компьютером
     * в зависимости от переменной isComputer */
    public Hero addHero() {
        Hero hero;
        if (isComputer) {
            hero = addHeroForComputer();
        } else {
            hero = addHeroForPerson();
        }
        return hero;
    }

    /**Метод, добавляющий всех созданных персоажей в масив персонажей */
    public void addHeroes() {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i] = addHero();
        }
    }

    /**Метод, пересоздающий отряд если в нем есть погибший воин(уже без погибшего) */
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

    /**Метод, помечающий персонажа как мертвого */
    public void dieIfNoHealth(Hero hero) {
        if (hero.getHealth() <= 0) {
            System.out.print(hero.toStringNameAndRace() + " погибает.");
            if (Methods.getTrueClassName(hero).equals("UndeadKnight")) {
                hero.resurrect();
            }
            if (hero.getHealth() <= 0) {
                hero.setName(null);
            }
        }
    }

    /*Метод, проверяющий не уничтожен ли весь отряд игрока */
    /*public boolean checkIfSquadIsDead() {
        for (Hero hero : heroes) {
            if (hero.getName() != null) {
                return false;
            }
        }
        return true;
    }*/

    /**Метод, проверяющий есть ли в отряде погибший воин */
    public boolean checkIfSquadHasFallenHero() {
        for (Hero hero : heroes) {
            if (hero.getName() == null) {
                return true;
            }
        }
        return false;
    }

    /**Метод, реализующий атаку одним персонажем другого */
    public void heroAttackHero(Hero attacker, Hero defender) {
        attacker.bleed();
        if (attacker.getHealth() <= 0) {
            dieIfNoHealth(attacker);
        } else {
            int attackPower = getEnemyAttackAfterBlock(attacker, defender);
            System.out.print(attacker.toStringNameAndRace() + " наносит урон " + attackPower + ".");
            if (!dodgeFromAttack(defender)) {
                System.out.print("Здоровье " + defender.toStringNameAndRace() + " падает с " + defender.getHealth());
                int newHealth = defender.getHealth() + defender.getArmor() - attackPower;
                defender.setHealth(newHealth);
                System.out.println(" до " + defender.getHealth());
                hurtToBleeding(attacker, defender);
                armorDestruct(attacker, defender);
                if (defender.getHealth() <= 0) {
                    dieIfNoHealth(defender);
                }
            }
        }
    }

    /**Метод, реализующий выбор кого будет атаковать персонаж человека и саму атаку */
    public void playerHeroAttack(Hero personHero, Player computer) {
        if (computer.checkIfSquadHasFallenHero()) {
            computer.reformSquad();
        }

        System.out.println("Ходит ваш герой " + personHero.toStringNameAndRace());
        int enemyNum;
        while (true) {
            //computer.outputSquadInformation();
            System.out.print("Введите номер врага, которого хотите атаковать: ");
            enemyNum = Methods.inputParameter(0, computer.getSquadSize()) - 1;
            if (enemyNum < 0 || enemyNum > computer.getHeroes().length) {
                System.out.println("Вы вибрали неверный номер. Повторите ввод.");
            } else if (computer.getHeroes()[enemyNum] != null) {
                break;
            } else {
                System.out.println("Вы выбрали убитого врага. Повторите ввод");
            }
        }
        heroAttackHero(personHero, computer.getHeroes()[enemyNum]);
        if (computer.checkIfSquadHasFallenHero()) {
            computer.reformSquad();
        }
    }

    /**Метод, реализующий выбор кого будет атаковать персонаж компьютера и саму атаку */
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
        if (person.checkIfSquadHasFallenHero()) {
            person.reformSquad();
        }
        //outputSquadInformation();
    }

    /**Метод, реализующий битву в течении раунда(раунд длиться пока не походят
     * все персонажи) */
    public void round(Player person, Player computer) {
        int heroCounter = 0;
        while (heroCounter < person.getSquadSize()) {
            if (computer.getSquadSize() == 0 || person.getSquadSize() == 0) {
                System.out.println(computer.getSquadSize());
                break;
            }
            System.out.println("\n-----------------------------------------------");
            System.out.println("\n\t\tВАШ ХОД ");
            computer.outputSquadInformation();
            person.outputSquadInformation();
            if (heroCounter < person.getSquadSize() && person.getHeroes()[heroCounter].getName() != null) {
                Hero hero = person.getHeroes()[heroCounter];
                playerHeroAttack(hero, computer);
                if (hero.getName() == null) {
                    person.reformSquad();
                }
            }


            if (person.getSquadSize() == 0 || computer.getSquadSize() == 0) {
                System.out.println(person.getSquadSize());
                break;
            }
            System.out.println("\n-----------------------------------------------");
            System.out.println("\n\t\tХОД ВРАГА");
            if (heroCounter < computer.getSquadSize() && computer.getHeroes()[heroCounter].getName() != null) {
                Hero hero = computer.getHeroes()[heroCounter];
                computerHeroAttack(hero, person);
                if (hero.getName() == null) {
                    computer.reformSquad();
                }
            }
            heroCounter++;
        }
    }

    /**Метод, реализующий битву в течении всей игры(пока один из игроков не лишиться
     * всех бойцов) */
    public void fight(Player person, Player computer) {
        System.out.println("\t\tНАЧАЛО БОЯ!!");
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
            System.out.println("\n-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("\t\tРАУНД № " + roundCounter);
            round(person, computer);
            roundCounter++;
        }
    }

    /**Метод, выводящий на екран информацию про весь отряд*/
    public void outputSquadInformation() {
        if (isComputer && heroes.length > 0) {
            System.out.println("\tВражеский отряд");
        }
        if (!isComputer && heroes.length > 0) {
            System.out.println("\tВаш отряд");
        }
        int counter = 1;
        for (Hero hero : heroes) {
            System.out.println("\t" + counter + ")" + hero.toString());
            counter++;
        }
        System.out.println();
    }
}


