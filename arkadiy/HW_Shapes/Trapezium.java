package HW_Shapes;

public class Trapezium extends Shape {
	private double secondParallelSide;
    public Trapezium(double firstParallelSideLength, double secondParallelSideLength, double heightLength) {
       super(firstParallelSideLength, heightLength);
       this.secondParallelSide = secondParallelSideLength;
   }
	public double getSquare() {
       return ((getSideLength() + secondParallelSide) / 2) * getHeightLength();
   }
}
