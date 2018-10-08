package javaEssential.homework.shape;

public class Calculating {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.outputSquare(triangle.calculateSquare());

        Trapezium trapezium = new Trapezium();
        trapezium.outputSquare(trapezium.calculateSquare());

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.outputSquare(parallelogram.calculateSquare());
        parallelogram.outputSquare(parallelogram.calculateSquareThroughAngle());

        Rhombus rhombus = new Rhombus();
        rhombus.outputSquare(rhombus.calculateSquare());
        rhombus.outputSquare(rhombus.calculateSquareThroughAngle());

        Rectangle rectangle = new Rectangle();
        rectangle.outputSquare(rectangle.calculateSquare());

        Square square = new Square();
        square.outputSquare(square.calculateSquare());
    }
}
