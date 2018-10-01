package java_essential.composition_aggregation;

public class Test {
    public static void main(String[] args) {
        Freshener freshener = new Freshener("Lemon");
        Car crysler = new Car(2.7, freshener);
        crysler.run();

        crysler = null;
    }
}
