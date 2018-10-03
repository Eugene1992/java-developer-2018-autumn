package shape_calculation;

abstract class Polygon extends Shape {

    private int sideA;

    protected Polygon(int sideA) {
        this.sideA = sideA;
    }

    protected void setSideA(int sideA) {
        this.sideA = sideA;
    }

    protected int getSideA() {
        return sideA;
    }

    protected Polygon() {
    }

    protected abstract double calculateShapeArea();



}
