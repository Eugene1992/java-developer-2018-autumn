package homeworks.javaEssential.homework01.Shapes.triangles;

import homeworks.javaEssential.homework01.Shapes.Shape;

public class Triangle extends Shape{

    public double getSquare() {
        return (getSideLength() * getHeightLength()) / 2;
    }

    public Triangle(double sideLength, double heightLength) {
        super(sideLength, heightLength);
    }
}
