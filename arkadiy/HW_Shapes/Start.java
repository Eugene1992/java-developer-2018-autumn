package HW_Shapes;

public class Start {
	public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(18.5, 5);
        Quadrate quadrate = new Quadrate(9);
        Rectangle rectangle = new Rectangle(12, 6.8);
        Rhombus rhombus = new Rhombus(29.8, 7);
        Trapezium trapezium = new Trapezium(5, 17, 7);
        Triangle triangle = new Triangle(6.3, 18.8);
         printAllSquares(parallelogram, quadrate, rectangle, rhombus, trapezium, triangle);
    }
     public static void printAllSquares(Shape... shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getSquare());
        }
    }

}
