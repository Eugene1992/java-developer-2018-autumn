public class ClassTest {
    public static void main (String [] args){
        int a = 101;
        System.out.println("Must be: " + Integer.toBinaryString(a));
        int b1 = a % 2;
        a = a/2;

        int b2 = a%2;
        a = a/2;

        int b3 = a%2;
        a = a/2;

        int b4 = a%2;
        a = a/2;

        int b5 = a%2;
        a = a/2;

        int b6 = a%2;
        a = a/2;

        int b7 = a%2;
        a = a/2;

        System.out.println("My version: " + b7 +b6 +b5 + b4 + b3 + b2 + b1);
    }
}
