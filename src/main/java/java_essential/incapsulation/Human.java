package java_essential.incapsulation;

public class Human {
    private String name;
    public static int count;

    public Human(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
