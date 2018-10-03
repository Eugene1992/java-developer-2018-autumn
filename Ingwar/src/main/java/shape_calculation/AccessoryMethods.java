package shape_calculation;

import java.util.Scanner;

class AccessoryMethods {

    public static void wirteMessage(String string) {
        System.out.println(string);
    }

    public static int getIntValuefromInput(String string) {
        System.out.println(string);
        Scanner scan = new Scanner(System.in);
        int returnValue = scan.nextInt();
        return returnValue;
    }

    public static void calcPolygonArea(Polygon polygon) {
        wirteMessage("The area of " + polygon.getClass().getSimpleName().toLowerCase() +
                " with specified dimenshions is " + polygon.calculateShapeArea() + " square units.");

    }

}
