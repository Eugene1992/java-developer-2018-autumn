package shape_calculation;

public class Rectangle extends Polygon {

    protected int sideB;

    public Rectangle() {
        this.setSideA(AccessoryMethods.getIntValuefromInput("Input the length of first side of the rectangle"));
        this.sideB = AccessoryMethods.getIntValuefromInput("Input the length of second side of the rectangle");
    }

    @Override
    protected double calculateShapeArea() {
        return this.getSideA() * this.sideB;
    }
}
