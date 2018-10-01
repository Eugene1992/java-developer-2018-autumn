package java_essential.polymorphism;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    protected void speak() {
        System.out.println("Hello, i'm duck " + name + ". I'm quack!");
    }
}
