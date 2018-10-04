package homeWorkEssential.hWork003;

public class Square extends Snape {
    protected Square(double a) {
        super(a);
    }

    @Override
    protected double getFigureArea() {
        return a * a;
    }

    @Override
    protected String convertToString() {
        return "квадрата с параметрами (" + a + ")";
    }
}
