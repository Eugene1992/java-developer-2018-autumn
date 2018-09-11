public class NumToCode {
    public static void main(String[] args) {
        byte a = 15;
        int b = a % 2;
        int d = a / 2;

        int b1 = d % 2;
        int d1 = d / 2;

        int b2 = d1 % 2;
        int d2 = d1 / 2;

        int b3 = d2 % 2;
        int d3 = d2 / 2;


        System.out.print(b3);
        System.out.print(b2);
        System.out.print(b1);
        System.out.print(b);
    }
}
