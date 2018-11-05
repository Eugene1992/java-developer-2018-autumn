package homeworks.javaEssential.homework01.SeaBattleOOP;

public class Player {
    BattleField battleField;
    private boolean isReal;
    private boolean hasWon;

    int[] makeSingleShotArray() {
        int[] singleShotLocationArray = new int[2];

        for (int i = 0; i < singleShotLocationArray.length; i++) {
            Utils.printSetShipOrShotLocationMessage(Utils.shotString, Utils.xyArray[i]);
            int coordinate = Utils.scanUserInput();
            if(coordinate >= 0 && coordinate < 4) {
                singleShotLocationArray[i] = coordinate;
            } else {
                Utils.printNotInRangeMessage();
                i--;
            }
        }

        return singleShotLocationArray;
    }

    void checkShotResult(int[] singleShotArray) {
    }

    boolean getHasWonParameter() {
        return hasWon;
    }

    void setHasWonParameterTrue() {
        hasWon = true;
    }

    public Player(boolean isReal) {
        this.isReal = isReal;
        this.battleField = battleField;

        this.hasWon = false;

        BattleField battleField1 = new BattleField();
    }


}
