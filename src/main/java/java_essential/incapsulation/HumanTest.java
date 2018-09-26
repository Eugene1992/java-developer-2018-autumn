package java_essential.incapsulation;

public class HumanTest {

    public static void main(String[] args) {
        Human human = new Human("Anna");
        Human human1 = new Human("Tom");
        System.out.println(Human.getCount());
        Human human2 = new Human("Jack");
        Human human3 = new Human("John");

        System.out.println(Human.getCount());
    }
}
