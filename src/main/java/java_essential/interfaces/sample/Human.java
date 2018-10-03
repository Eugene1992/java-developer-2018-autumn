package java_essential.interfaces.sample;

public class Human implements Movable {
    private int speed;

    public Human(int speed) {
        this.speed = speed;
    }

    @Override
    public int calcDistance(int hours) {
        return speed * hours;
    }
}
