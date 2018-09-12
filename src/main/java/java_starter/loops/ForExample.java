package java_starter.loops;

public class ForExample {
    public static void main(String[] args) {
//        for (counter init; condition; counter increment/decrement)
        /*for (int count = 0; count < 10; count++) {
            System.out.println(count);
        }*/

        /*int count = 0;
        for (; count < 10; ) {
            System.out.println(count);
            count += 10;
        }*/

        for (int count = 0, limit = 10; count < 10 && limit != 7; count++, limit--) {
            System.out.println(count);
        }
    }
}
