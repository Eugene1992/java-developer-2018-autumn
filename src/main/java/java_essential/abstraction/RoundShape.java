package java_essential.abstraction;

public abstract class RoundShape extends Shape {
    public RoundShape(int a) {
        super(a);
    }

    public abstract double calcCircumference();
}
