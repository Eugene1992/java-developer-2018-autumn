package homeworks.javaEssential.homework01.battle;

import homeworks.javaEssential.homework01.battle.units.*;
import homeworks.javaEssential.homework01.battle.utils.Messages;
import homeworks.javaEssential.homework01.battle.utils.Random;
import homeworks.javaEssential.homework01.battle.utils.UserInputScanner;

public class Player {

    public static int unitsAmount = getUnitsAmount();
    private static UnitCore[] playerUnitsArray = new UnitCore[unitsAmount];

    private boolean isReal;
    private boolean hasWon;

    public boolean isReal() {
        return isReal;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    public static int getUnitsAmount() {
        System.out.println(Messages.CHOOSE_UNITS_AMOUNT_MESSAGE.getMessage());
        return UserInputScanner.getUserInputInt();
    }

    public UnitCore[] getPlayerUnitsArray() {
        return playerUnitsArray;
    }

    public void setPlayerUnitsArray(int index, UnitCore unit) {
        playerUnitsArray[index] = unit;
    }

    private UnitCore getUnitTypeAccordingToUserInput(int userInput) {
        switch (userInput) {
            case 1:
                return new Dwarf();
            case 2:
                return new Elf();
            case 3:
                return new Human();
            case 4:
                return new Orc();
            default:
                return new Human();
        }
    }

    protected void chooseUnits() {
        if (this.isReal()) {
            for (int i = 0; i < unitsAmount; i++) {
                System.out.println(Messages.CHOOSE_UNIT_IN_ARMY_MESSAGE.getMessage());
                setPlayerUnitsArray(i, getUnitTypeAccordingToUserInput(UserInputScanner.getUserInputInt()));
            }
        } else {
            for (int i = 0; i < unitsAmount; i++) {
                setPlayerUnitsArray(i, getUnitTypeAccordingToUserInput(Random.getRandomNumberInRange(3) + 1));
            }
        }
    }

    public void playSingleBattleRound() {

    }


    public static void printPlayerArmy(Player player) {
//        todo
        for (int i = 0; i < player.getPlayerUnitsArray().length; i++) {
            System.out.println(player.getPlayerUnitsArray()[i].getRace() + " " + player.getPlayerUnitsArray()[i].getName()
                    + "[" + player.getPlayerUnitsArray()[i].getCurrentHealth() + "]");
        }
    }

    public Player(boolean isReal) {
        this.isReal = isReal;
        this.hasWon = false;
    }
}
