package java_essential.class_into_class.anonymous;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, i'm animal " + name);
    }
}
