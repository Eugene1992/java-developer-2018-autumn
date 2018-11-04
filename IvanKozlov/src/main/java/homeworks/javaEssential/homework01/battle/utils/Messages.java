package homeworks.javaEssential.homework01.battle.utils;

public enum Messages {
    CHOOSE_UNITS_AMOUNT_MESSAGE("Enter amount of units in each army"),
    CHOOSE_UNIT_NAME_MESSAGE("Enter this unit's name"),
    CHOOSE_UNIT_IN_ARMY_MESSAGE("Choose unit for Your army. 1 - Dwarf, 2 - Elf, 3 - Human, 4 - Orc"),
    CHOOSE_UNIT_TO_ATTACK_MESSAGE("Which unit will You attack");

    private String message;

    public java.lang.String getMessage() {
        return message;
    }

    Messages(String message) {
        this.message = message;
    }

}
