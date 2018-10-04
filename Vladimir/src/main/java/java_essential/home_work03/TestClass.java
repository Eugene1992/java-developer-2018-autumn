package java_essential.home_work03;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Площадь квадрата:" + Square.getSquare(5));
        System.out.println("Площадь прямоугольника:" + Rectangle.getSquare(5, 10));
        System.out.println("Площадь ромба с использованием угла: " + Diamond.getSquareWithHeight(5, 20));
        System.out.println("Площадь ромба с использованием высоты: " + Diamond.getSquareWithAngle(5, 60));
        System.out.println("Площадь треугольника: " + Triangle.getTriangleSquare(5, 25));
        System.out.println("Площадь параллелограма с использованием угла: " + Parallelogram.getSquareWithHeight(5, 20));
        System.out.println("Площадь параллелограма с использованием высоты: " + Parallelogram.getSquareWithAngle(5, 10, 60));
        System.out.println("Площадь трапеции:" + Trapeze.getSquare(5, 15, 10));
    }
}
