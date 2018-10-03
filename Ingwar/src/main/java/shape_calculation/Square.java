package shape_calculation;

public class Square extends Polygon {

    public Square() {
        this.setSideA(AccessoryMethods.getIntValuefromInput("Input the length of one side of the triangle"));
    }

    @Override
    protected double calculateShapeArea() {
        return Math.pow(this.getSideA(), 2);
    }
}
