package java_essential.home_work02;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, my dear friend!!! It's new third java-game");
        System.out.println("Enter number squad");
        int numberAquad = scan.nextInt();
        Hero[] squadPlayer = new Hero[numberAquad];
        Hero[] squadComp = new Hero[numberAquad];
        getSquadPlayer(squadPlayer, numberAquad, true);
        getSquadComp(squadComp, numberAquad, false);
        System.out.println("And now game begin!");
        boolean isGameEnd = false;
        while (isGameEnd == false) {
//            System.out.println(getSumHealth(squadPlayer));
//            System.out.println(getSumHealth(squadComp));
            getPlayerSquard(squadPlayer, true);
            getPlayerSquard(squadComp, false);
            squadComp = attackPlayerMethod(squadPlayer, squadComp);
            isGameEnd = endGame(squadPlayer, squadComp);
            if (isGameEnd == false) {
                squadPlayer = attackCompMethod(squadPlayer, squadComp, squadPlayer.length);
            }
            isGameEnd = endGame(squadPlayer, squadComp);
        }
        System.out.println(squadComp.length);
        congratulation(squadComp);
    }

    //метод для введения имени героя
    public static String getName(boolean isPlayer) {
        String name;
        if (isPlayer) {
            Scanner scanName = new Scanner(System.in);
            System.out.println("Enter name for your hero");
            name = scanName.next();
            return name;
        } else {
//            String [] nameForComp = {"Теодор", "Солмир", "Серена", "Халон", "Даремиф", "Астрал", "Пигуедрам", "Торосар"};
            name = MethodsForHelp.getCompRandomName();
            return name;
        }
    }

    //метод для создания команды играком
    public static Hero[] getSquadPlayer(Hero[] squadPlayer, int numberAquad, boolean isPlayer) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        while (i < numberAquad) {
            System.out.println("Choose number of hero: 1 - Dwarf, 2 - Human, 3 - Elf, 4 - Ork");
            int numberHero = scan.nextInt();
            getSomeHero(squadPlayer, numberHero, i, isPlayer);
            i++;
        }
        return squadPlayer;
    }

    //    метод для создания определенного героя
    public static Hero getSomeHero(Hero[] squad, int numberHero, int i, boolean isPlayer) {
        switch (numberHero) {
            case 1:
                Dwarf dwarf = new Dwarf(getName(isPlayer));
                squad[i] = dwarf;
                break;
            case 2:
                Human human = new Human(getName(isPlayer));
                squad[i] = human;
                break;
            case 3:
                Elf elf = new Elf(getName(isPlayer));
                squad[i] = elf;
                break;
            case 4:
                Ork ork = new Ork(getName(isPlayer));
                squad[i] = ork;
                break;
            default:
                System.out.println("You enter wrong number");
        }
        return squad[i];
    }

    //метод для подбора команды компом
    public static Hero[] getSquadComp(Hero[] squadComp, int numberAquad, boolean isPlayer) {
        int i = 0;
        while (i < numberAquad) {
            int numberHero = MethodsForHelp.getRundomNumber(1, 4);
            getSomeHero(squadComp, numberHero, i, isPlayer);
            i++;
        }
        return squadComp;
    }

    //метод для вывода отряда
    public static void getPlayerSquard(Hero[] squadComp, boolean isPlayer) {
        if (isPlayer) {
            System.out.println("You have: ");
        } else {
            System.out.println("Comp have: ");
        }
        int i = 1;
        for (Hero squad : squadComp) {
            if (squad.getName().equals("Dead hero")) {
            } else {
                System.out.println(i + ") " + squad.getName() + ": health - " + squad.getHealth() + "; attack - " + squad.getAttack() + "; armour - " + squad.getArmor());
                i++;
            }
        }
    }

    //    метод для атаки игрока
    public static Hero[] attackPlayerMethod(Hero[] squadPlayer, Hero[] squadComp) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of hero for attack: ");
        int numberHeroForPlayerAttack = (scan.nextInt() - 1);
        System.out.println("Enter number of comp hero for attack: ");
        int numberCompHeroForPlayerAttack = (scan.nextInt() - 1);
        int damage = squadPlayer[numberHeroForPlayerAttack].attackMethods(squadPlayer, squadComp, numberHeroForPlayerAttack, numberCompHeroForPlayerAttack);
        squadComp[numberCompHeroForPlayerAttack].defenceMethods(squadPlayer, squadComp, numberHeroForPlayerAttack, numberCompHeroForPlayerAttack, damage);
        if (squadComp[numberCompHeroForPlayerAttack].getHealth() <= 0) {
            System.out.println(squadComp[numberCompHeroForPlayerAttack].getName() + " was kill");
            squadComp[numberCompHeroForPlayerAttack] = null;
            return heroArrayWithoutDeadHero(squadComp);
        }
        return squadComp;
    }

    //    метод для атаки комп
    public static Hero[] attackCompMethod(Hero[] squadPlayer, Hero[] squadComp, int numberSquad) {
        int numberHeroForCompAttack = MethodsForHelp.getRundomNumber(0, numberSquad - 1);
        int numberPlayerHeroForComAttack = MethodsForHelp.getRundomNumber(0, numberSquad - 1);
        int damage = squadComp[numberHeroForCompAttack].attackMethods(squadComp, squadPlayer, numberHeroForCompAttack, numberPlayerHeroForComAttack);
        squadPlayer[numberHeroForCompAttack].defenceMethods(squadComp, squadPlayer, numberHeroForCompAttack, numberPlayerHeroForComAttack, damage);
        if (squadPlayer[numberPlayerHeroForComAttack].getHealth() <= 0) {
            System.out.println(squadPlayer[numberPlayerHeroForComAttack].getName() + " was kill");
            squadPlayer[numberPlayerHeroForComAttack] = null;
            return heroArrayWithoutDeadHero(squadPlayer);
        }
        return squadPlayer;
    }

    //метод для подсчета общего кол-ва жизней
    public static int getSumHealth(Hero[] squad) {
        int sumHealth = 0;
        for (Hero someHero : squad) {
            sumHealth += someHero.getHealth();
        }
        return sumHealth;
    }

    //метод для окончания игры
    public static boolean endGame(Hero[] squadPlayer, Hero[] squadComp) {
        if (squadPlayer.length <= 0 || squadComp.length <= 0) {
            return true;
        } else {
            return false;
        }
    }

    //    метод для поздравления
    public static void congratulation(Hero[] squadComp) {
        if (squadComp.length == 0) {
            System.out.println("Congratulations!! You win!!!");
        } else {
            System.out.println("Unfortunately you lost");
        }
    }

    //    метод для уменьшения матрицы героев
    public static Hero[] heroArrayWithoutDeadHero(Hero[] squad) {
        Hero[] newHeroSquad = new Hero[squad.length - 1];
        for (int i = 0, j = 0; i < squad.length; i++) {
            if (squad[i] != null) {
                newHeroSquad[j] = squad[i];
                j++;
            }
        }
        return newHeroSquad;
    }
}



