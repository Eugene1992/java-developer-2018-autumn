package java_essential.abstraction;

public class Test {
    public static void main(String[] args) {
//        Shape shape = new Shape(10);
//        System.out.println(shape.calcSquare());
        Shape shape = new Circle(10);

        Shape[] shapes = new Shape[]{shape};
    }
}
