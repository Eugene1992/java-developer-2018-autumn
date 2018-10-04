package homeWorkEssential.hWork003;

public class Ractangle extends ContainsTwoSides {
    protected Ractangle(double a, double b) {
        super(a, b);
    }

    @Override
    protected double getFigureArea() {
        return a * b;
    }

    @Override
    protected String convertToString() {
        return "прямоугольника с параметрами (" + a + ", " + b + ")";
    }
}
