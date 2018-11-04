package homeworks.javaEssential.homework01.battle;

import homeworks.javaEssential.homework01.battle.units.UnitCore;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Game {

    public void start() {
        Player player = new Player(true);
        player.chooseUnits();
        Player comp = new Player(false);
        comp.chooseUnits();
    }

    private UnitCore[] getAllUnitsArray(Player player1, Player player2) {
        UnitCore[] allUnitsArray = new UnitCore[player1.getPlayerUnitsArray().length + player2.getPlayerUnitsArray().length];
        for (int i = 0, j = player1.getPlayerUnitsArray().length; i < player1.getPlayerUnitsArray().length; i++) {
            if(!player1.getPlayerUnitsArray()[i].isDead()) {
                allUnitsArray[i] = player1.getPlayerUnitsArray()[i];
            }
            if(!player2.getPlayerUnitsArray()[i].isDead()) {
                allUnitsArray[j] = player2.getPlayerUnitsArray()[i];
            }
        }
        return allUnitsArray;
    }

    public UnitCore[] getSortedByInitiativeAllUnitsArray(Player player1, Player player2) {
        UnitCore[] allUnitsArray = getAllUnitsArray(player1, player2);

        return allUnitsArray;
    }


}
