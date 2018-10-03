package shape_calculation;

public class StartCalculation {
    public static void calculate() {
        AccessoryMethods.wirteMessage("Choose shape to calculate its area");
        int chosenShape = AccessoryMethods.getIntValuefromInput("1 for triangle, 2 for square, 3 for rectangle, " +
                "4 for diamond, 5 for parallelogram, 6 for trapezium, 0 for exit");
        switch (chosenShape) {
            case 0:
                break;
            case 1:
                AccessoryMethods.calcPolygonArea(new Triangle());
                break;
            case 2:
                AccessoryMethods.calcPolygonArea(new Square());
                break;
            case 3:
                AccessoryMethods.calcPolygonArea(new Rectangle());
                break;
            case 5:
                AccessoryMethods.calcPolygonArea(new Parallelogram());
                break;
            case 6:
                AccessoryMethods.calcPolygonArea(new Trapezium());
                break;
            default:
                AccessoryMethods.wirteMessage("Shape didn't chosen");
        }
    }
}
