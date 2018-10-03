package shape_calculation;

public class Diamond extends Polygon {

    protected int shortDiagonal;

    public Diamond() {
        this.setSideA(AccessoryMethods.getIntValuefromInput("Input the length of the long diagonal of the diamond"));
        this.shortDiagonal = AccessoryMethods.getIntValuefromInput("Input the length of the short diagonal of the diamond");
    }

    @Override
    protected double calculateShapeArea() {
        return (this.getSideA() * this.shortDiagonal) / 2;
    }
}
