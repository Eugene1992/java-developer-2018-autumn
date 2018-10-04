package homeWorkEssential.hWork003;

public class Trapeze extends ContainsTwoSidesHeight {
    protected Trapeze(double a, double b, double h){
        super(a, b, h);
    }

    @Override
    protected double getFigureArea() {
        return ((a + b ) / 2) * h;
    }

    @Override
    protected String convertToString() {
        return "трапеции с параметрами (" + a + "," + b + ", Высота = " + h + ")";
    }
}
