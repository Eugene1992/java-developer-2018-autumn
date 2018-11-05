package homeworks.javaEssential.homework04;

public class Test {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();


        stack.push("One");
        stack.push("Two");

        stack.print();

        String[] strings = {"Three", "Four", "Five"};

        System.out.println(stack.pull());

        stack.pushAll(strings);

        stack.print();

        System.out.println(stack.size());

        stack.pull();

        stack.print();
    }
}
