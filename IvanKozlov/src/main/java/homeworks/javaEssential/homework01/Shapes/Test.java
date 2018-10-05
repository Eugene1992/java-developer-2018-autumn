package homeworks.javaEssential.homework01.Shapes;

import homeworks.javaEssential.homework01.Shapes.quadrangels.Trapezium;
import homeworks.javaEssential.homework01.Shapes.quadrangels.parralelograms.Parallelogram;
import homeworks.javaEssential.homework01.Shapes.quadrangels.parralelograms.Quadrate;
import homeworks.javaEssential.homework01.Shapes.quadrangels.parralelograms.Rectangle;
import homeworks.javaEssential.homework01.Shapes.quadrangels.parralelograms.Rhombus;
import homeworks.javaEssential.homework01.Shapes.triangles.Triangle;

public class Test {

    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(10, 5);
        Quadrate quadrate = new Quadrate(5);
        Rectangle rectangle = new Rectangle(10, 5);
        Rhombus rhombus = new Rhombus(10, 5);
        Trapezium trapezium = new Trapezium(5, 12, 6);
        Triangle triangle = new Triangle(5, 14);

        printAllSquares(parallelogram, quadrate, rectangle, rhombus, trapezium, triangle);
    }

    public static void printAllSquares(Shape... shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getSquare());
        }
    }

}
