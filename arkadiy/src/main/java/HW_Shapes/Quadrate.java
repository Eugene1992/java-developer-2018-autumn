package HW_Shapes;

public final class Quadrate extends Rectangle {
	public Quadrate(double sideLength) {
        super(sideLength, sideLength);
    }
     public double getSquare() {
        return Math.pow(getSideLength(), 2);
    }
}
