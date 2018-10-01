package java_essential.polymorphism;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    protected void speak() {
        System.out.println("Hello, i'm dog " + name + ". I'm woof!");
    }
}
