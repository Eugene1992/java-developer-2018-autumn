package java_essential.composition_aggregation;

public class Car {
    private Engine engine;
    private Freshener freshener;

    public Car(double engineVolume, Freshener freshener) {
        this.engine = new Engine(engineVolume);
        this.freshener = freshener;
    }

    public void run() {
        engine.on();
        System.out.println("Car runs...");
    }
}
