package homeWorkEssential.hWork003;

public class Triangle extends Snape {

    private double h;

     Triangle(double a, double h){
        super(a);
        this.h = h;
    }

    @Override
    protected double getFigureArea() {
        return (a * h) / 2;
    }

    @Override
    protected String convertToString() {
        return "треугольника с параметрами (" + a + ", Высота = " + h + ")";
    }
}
