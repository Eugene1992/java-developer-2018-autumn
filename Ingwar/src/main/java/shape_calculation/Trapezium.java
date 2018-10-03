package shape_calculation;

public class Trapezium extends Polygon {

    protected int sideB;
    protected int trapeziumHeight;

    public Trapezium() {
        this.setSideA(AccessoryMethods.getIntValuefromInput("Input the length of the first base of the parallelogram"));
        this.sideB = AccessoryMethods.getIntValuefromInput("Input the length of the second base of the parallelogram");
        this.trapeziumHeight = AccessoryMethods.getIntValuefromInput("Input the height of the parallelogram");
    }

    @Override
    protected double calculateShapeArea() {
        return (this.getSideA() + this.sideB) / 2 * this.trapeziumHeight;
    }
}
