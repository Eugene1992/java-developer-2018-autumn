package homeWorkEssential.hWork003;

public class Main {
    public static void main(String[] args) {
        Snape parallelogram = new Parallelogram(20, 20, 30);
        Snape rectangle = new Ractangle(10, 5);
        Snape rhombus = new Rhombus(20, 5);
        Snape square = new Square(10);
        Snape trapeze = new Trapeze(20, 10 , 5);
        Snape triangle = new Triangle(20, 10);
        getAllFigure(parallelogram, rectangle, rhombus, square, trapeze, triangle);
    }

    private static void getAllFigure(Snape... snapes) {
        for (Snape snape : snapes) {
            System.out.println("Площадь " + snape.convertToString() + " = " + snape.getFigureArea());
        }
    }
}


