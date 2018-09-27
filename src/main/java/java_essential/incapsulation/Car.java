package java_essential.incapsulation;

public class Car {
    private String brand;
    private static int basicSerialNumber = 1221;

    public Car(String brand) {
        this.brand = brand;
    }

    public static void checkSerial() {
//        System.out.println(brand);
        System.out.println(basicSerialNumber);
    }

    public void checkBrand() {
        System.out.println(this.brand);
        System.out.println(basicSerialNumber);
    }

    public static void main(String[] args) {
        Car tesla = new Car("Tesla");
        tesla.checkBrand();

        Car mercedes = new Car("Mercedes");
        mercedes.checkBrand();

        Car.checkSerial();
    }
}
