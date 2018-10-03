package shape_calculation;

public class Parallelogram extends Polygon {

    protected int parallelogramHeight;

    public Parallelogram() {
        this.setSideA(AccessoryMethods.getIntValuefromInput("Input the length of one side of the parallelogram"));
        this.parallelogramHeight = AccessoryMethods.getIntValuefromInput("Input the height of the parallelogram");
    }

    @Override
    protected double calculateShapeArea() {
        return this.getSideA() * this.parallelogramHeight;
    }
}
