package homeWorkEssential.hWork003;

public class Rhombus extends Snape{
    private double angle;

    protected Rhombus(double a, double angle){
        super(a);
        this.angle = angle;
    }

    @Override
    protected double getFigureArea() {
        return a * a * Math.sin(angle * Math.PI) / 180;
    }

    @Override
    protected String convertToString() {
        return "ромба с параметрами (" + a + ", Угол = " + angle + ")";
    }
}
