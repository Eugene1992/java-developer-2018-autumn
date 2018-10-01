package java_essential.composition_aggregation;

public class Engine {

    private double volume;

    public Engine(double volume) {
        this.volume = volume;
    }

    public void on() {
        System.out.println("Engine on!");
    }
}
