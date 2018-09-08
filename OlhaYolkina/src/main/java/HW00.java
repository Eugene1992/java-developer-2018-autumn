public class HW00 {
    public static void main(String[] args) {
        byte a;
        short b;
        int c;
        long d;

        a = 1 + 2;
        b = 13 - 7;
        c = 56 / 4;
        d = 43 * 7;

        byte a1 = 44;
        byte a2 = 5;
        a = (byte) (a1 + a2);

        short b1 = 5;
        short b2 = 6;
        byte a3 = 3;
        a = (byte) ((b1 + b2) / a3);

        c = (b1 / b2) * (a1 / a2);

        c = b = a;

        c = b = 5;
    }
}
