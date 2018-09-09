public class ClassTest {
    public static void main (String [] args){
        int a = 52;
        System.out.println(Integer.toBinaryString(a));
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

        int b8 = a%2;
        a = a/2;

        System.out.print(b8);
        System.out.print(b7);
        System.out.print(b6);
        System.out.print(b5);
        System.out.print(b4);
        System.out.print(b3);
        System.out.print(b2);
        System.out.println(b1);

    }
}
