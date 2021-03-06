package java_essential.interfaces.sample;

public class Car implements Movable {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public int calcDistance(int hours) {
        return speed * hours;
    }
}
