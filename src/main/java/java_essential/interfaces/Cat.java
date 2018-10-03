package java_essential.interfaces;

import java.io.Serializable;

public class Cat implements Movable, Serializable {
    private int speed;

    public Cat(int speed) {
        this.speed = speed;
    }

    @Override
    public int calcDistance(int hours) {
        return speed * hours;
    }
}
