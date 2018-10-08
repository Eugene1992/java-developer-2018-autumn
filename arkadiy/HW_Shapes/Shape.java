package HW_Shapes;

public abstract class Shape {
	public double getSideLength() {
		return sideLength;
	}

	public double getHeightLength() {
		return heightLength;
	}

	private double sideLength;
	private double heightLength;

	public double getSquare() {
		return sideLength * heightLength;
	}

	public Shape(double sideLength, double heightLength) {
		this.sideLength = sideLength;
		this.heightLength = heightLength;
	}
}
