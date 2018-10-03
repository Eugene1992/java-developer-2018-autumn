package shape_calculation;

public class Triangle extends Polygon {

    protected int triangleHeight;

    public Triangle() {
        this.setSideA(AccessoryMethods.getIntValuefromInput("Input the length of one side of the triangle"));
        this.triangleHeight = AccessoryMethods.getIntValuefromInput("Input the height of the triangle");
    }

	@Override
    protected double calculateShapeArea() {
        return (this.getSideA() * this.triangleHeight) / 2;
	}
}
