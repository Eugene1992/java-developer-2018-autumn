package java_essential.inheritance;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka", true);
        Animal dog = new Dog("Rex");
        Animal barsik = new HomeCat("Barsik", false);

        sayHello(cat);
        sayHello(dog);
        sayHello(barsik);
    }

    static void sayHello(Animal animal) {
        animal.sayHello();
    }
}
