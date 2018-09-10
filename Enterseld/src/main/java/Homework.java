public class Homework {
    public static void main(String[] args) {
        byte p;
        short m;
        int g;
        long d;

        p = 5 + 3;
        m = 4 - 8;
        g = 9 / 3;
        d = 24 * 7;

        byte p1 = 15;
        byte p2 = 10;
        p = (byte) (p1 + p2);

        short m1 = 9;
        short m2 = 7;
        byte p3 = 8;
        p = (byte) ((m1 + m2) / p3);

        g = (m1 / m2) * (p1 + p2);

        g = m = p;

        g = m = 5;
    }
}