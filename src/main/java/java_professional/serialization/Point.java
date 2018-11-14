package java_professional.serialization;

import java.io.Serializable;

public class Point implements Serializable {
    private String x;
    private int y;

    public Point(String x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x='" + x + '\'' +
                ", y=" + y +
                '}';
    }
}
