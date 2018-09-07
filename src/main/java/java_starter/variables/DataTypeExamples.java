package java_starter.variables;

public class DataTypeExamples {
    public static void main(String[] args) {
        boolean b0 = true;
        boolean b1 = false;
//        boolean b2 = 10;

        byte b3 = (byte) 1000;

        short s = (short) 100000;

        int i = 2_000_000;

        long l = 222222222222222222L;

        float f = 10.0F;

        double d = 100.232;

        char c1 = 'a';
        char c2 = '\u5323'; // UNICODE
        char c3 = 97;

        int y = c1;

        System.out.println(c2);

        int z = 0x101;
        int z1 = 0b101;

        System.out.println(z);
        System.out.println(z1);
    }
}
