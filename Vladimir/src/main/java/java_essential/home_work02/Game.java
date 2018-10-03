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
            System.out.println(getSumHealth(squadPlayer));
            System.out.println(getSumHealth(squadComp));
            getPlayerSquard(squadPlayer, true);
            getPlayerSquard(squadComp, false);
            attacPlayerkMethod(squadPlayer, squadComp);
            attacCompkMethod(squadPlayer, squadComp, numberAquad);
            isGameEnd = endGame(squadPlayer, squadComp);
            System.out.println(isGameEnd);
        }
        congratulation(squadPlayer);
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

//    public static String getCompRandomName(String[] name) {
//        String compRandomName = name[MethodsForHelp.getRundomNumber(0, (name.length - 1))];
//        return compRandomName;
//    }

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
    public static void attacPlayerkMethod(Hero[] squadPlayer, Hero[] squadComp) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of hero for attack: ");
        int numberHeroForPlayerAttack = (scan.nextInt() - 1);
        System.out.println("Enter number of comp hero for attack: ");
        int numberCompHeroForPlayerAttack = (scan.nextInt() - 1);
        int damage = squadPlayer[numberHeroForPlayerAttack].getAttack() - squadComp[numberCompHeroForPlayerAttack].getArmor();
        System.out.println(squadPlayer[numberHeroForPlayerAttack].getName() + " damaged " + damage);
        int newHealth = squadComp[numberCompHeroForPlayerAttack].health - damage;
        squadComp[numberCompHeroForPlayerAttack].setHealth(newHealth);
        if (squadComp[numberCompHeroForPlayerAttack].getHealth() <= 0) {
            System.out.println(squadComp[numberCompHeroForPlayerAttack].getName() + " was kill");
            squadComp[numberCompHeroForPlayerAttack].setName("Dead hero");
        }

    }

    //    метод для атаки комп
    public static void attacCompkMethod(Hero[] squadPlayer, Hero[] squadComp, int numberAquad) {
        int numberHeroForCompAttack = MethodsForHelp.getRundomNumber(0, numberAquad - 1);
        int numberPlayerHeroForComAttack = MethodsForHelp.getRundomNumber(0, numberAquad - 1);
        int damage = squadComp[numberHeroForCompAttack].getAttack() - squadPlayer[numberPlayerHeroForComAttack].getArmor();
        System.out.println("Comp hero " + squadComp[numberHeroForCompAttack].getName() + " damaged " + damage);
        int newHealth = squadPlayer[numberPlayerHeroForComAttack].health - damage;
        squadPlayer[numberPlayerHeroForComAttack].setHealth(newHealth);
        if (squadPlayer[numberPlayerHeroForComAttack].getHealth() <= 0) {
            System.out.println(squadPlayer[numberPlayerHeroForComAttack].getName() + " was kill");
            squadPlayer[numberPlayerHeroForComAttack].setName("Dead hero");
        }
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
        boolean a = false;
        getSumHealth(squadPlayer);
        getSumHealth(squadComp);
        if (getSumHealth(squadPlayer) == 0 || getSumHealth(squadComp) == 0) {
            a = true;
            System.out.println(a);
            return a;
        } else {
            a = false;
            System.out.println(a);
            return a;
        }
    }

    //    метод для поздравления
    public static void congratulation(Hero[] squadPlayer) {
        if (getSumHealth(squadPlayer) == 0) {
            System.out.println("Congratulations!! You win!!!");
        } else {
            System.out.println("Unfortunately you lost");
        }

    }

}


