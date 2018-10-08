package java_essential.exceptions;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("Start");

                System.out.println(10 / 0);

                int[] ints = new int[10];
                System.out.println(ints[11]);

            System.out.println("Continue");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Catch ArithmeticException");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Catch IndexOutOfBoundsException");
        }
        System.out.println("End");
    }
}
