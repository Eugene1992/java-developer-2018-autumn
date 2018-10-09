package HW_Shapes;

public class Triangle extends Shape{
    public double getSquare() {
       return (getSideLength() * getHeightLength()) / 2;
   }
    public Triangle(double sideLength, double heightLength) {
       super(sideLength, heightLength);
   }
}
