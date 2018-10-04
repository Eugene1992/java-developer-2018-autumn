package java_essential.interfaces.sample;

public class Wind implements Movable {
    private int speed;

    public Wind(int speed) {
        this.speed = speed;
    }

    @Override
    public int calcDistance(int hours) {
        return speed * hours;
    }
}