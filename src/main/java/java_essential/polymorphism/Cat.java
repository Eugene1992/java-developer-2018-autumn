package java_essential.polymorphism;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    protected void speak() {
        System.out.println("Hello, i'm cat " + name + ". I'm meow!");
    }
}
