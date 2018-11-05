package homeworks.javaEssential.homework01.battle.utils;

import homeworks.javaEssential.homework01.battle.units.UnitCore;

import java.util.Comparator;

public class UnitCoreComparator implements Comparator<UnitCore> {

    public int compare(UnitCore a, UnitCore b){

        return a.getInitiative() - (b.getInitiative());
    }
}
