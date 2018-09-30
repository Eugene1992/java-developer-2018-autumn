package java_essential.inheritance;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void sayHello() {
        System.out.println("Hello, i'm " + name);
    }
}
