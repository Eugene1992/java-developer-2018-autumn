package java_essential.class_into_class.inner;

public class Test {
    public static void main(String[] args) {
        Ship ship = new Ship("Titanik");
        Ship.Engine engine1 = new Ship("Beda").new Engine();

        Ship.Engine engine2 = ship.new Engine();
        Ship.Engine engine3 = ship.new Engine();

        System.out.println(engine1.getShipName());
        System.out.println(engine2.getShipName());

//        Ship.Anchor anchor = new Ship.Anchor();
    }
}
