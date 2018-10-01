package java_essential.polymorphism;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void speak() {
        System.out.println("Hello, i'm animal " + name);
    }
}
