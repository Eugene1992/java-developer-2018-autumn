package java_essential.abstraction;

public class Circle extends RoundShape {
    public Circle(int a) {
        super(a);
    }

    @Override
    protected double calcSquare() {
        return 0;
    }

    @Override
    public double calcCircumference() {
        return 0;
    }
}
