package java_starter.conditions;

public class IfExample {
    public static void main(String[] args) {
        System.out.println("Start");
        if (true) {
            System.out.println("If true");
        }
        boolean isValid = false;
        if (isValid) {
            System.out.println("If false");
        }
        if (10 > 2) {
            System.out.println("If false");
        }
        if (isValid && 10 > 2) {
            System.out.println("If false");
        }
        if (false) {
            if (true) {

            }
        }
        if (false)
            System.out.println("Hi!");
            System.out.println("Hi!!!");
        System.out.println("End");
    }
}
