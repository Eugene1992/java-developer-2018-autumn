package java_essential_package.home_work_03;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(10);
        Shape parallelogram = new Parallelogram(20, 20, 30);
        Shape rectangle = new Rectangle(10, 5);
        Shape rhombus = new Rhombus(10, 5);
        Shape trapeze = new Trapeze(35, 20, 10);
        Shape triangle = new Triangle(10, 5);

        getAllFigureAreas(square, parallelogram, rectangle, rhombus, trapeze, triangle);
    }

    public static void getAllFigureAreas(Shape... shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Площадь " + shapes[i].convertToString() + " = " + shapes[i].getFigureArea());
        }
    }
}
