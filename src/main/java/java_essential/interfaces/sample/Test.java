package java_essential.interfaces.sample;

public class Test {
    public static void main(String[] args) {
        Movable cat = new Cat(110);
        Movable car = new Car(400);
        Movable human = new Human(45);
        Movable wind = new Wind(400);

        calcAndPrintDistances(3, car, cat, human, wind);
    }

    static void calcAndPrintDistances(int hours, Movable... entities) {
        for (Movable entity : entities) {
            System.out.println(entity.calcDistance(hours));
        }
    }
}
