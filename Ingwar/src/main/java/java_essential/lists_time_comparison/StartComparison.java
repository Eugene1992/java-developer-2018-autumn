package java_essential.lists_time_comparison;

public class StartComparison {
    public static void main(String[] args) {
        AccessoryMethods.wirteMessage("Input quantity of cycles to check " +
                "operations time");
        long quantityOfCycles = AccessoryMethods.getLongValuefromInput();
        AccessoryMethods.wirteMessage("Input type of value to fill the list elements");
        for (ElementValueTypes value : ElementValueTypes.values()) {
            AccessoryMethods.wirteMessage(value.name());
        }
        ElementValueTypes typeOfElements = AccessoryMethods.getTypeValuefromInput();
        AccessoryMethods.wirteMessage("Input value:");
        Object elementValue = new Object();
        switch (typeOfElements) {
            case INT:
                elementValue = AccessoryMethods.getIntValuefromInput();
                break;
            case LONG:
                elementValue = AccessoryMethods.getLongValuefromInput();
                break;
            case STRING:
                elementValue = AccessoryMethods.getStringValuefromInput();
                break;
        }
        new Calculatuions(quantityOfCycles, elementValue);
        AccessoryMethods.wirteMessage("/n");
        AccessoryMethods.wirteMessage("Comparison finished");
    }
}
