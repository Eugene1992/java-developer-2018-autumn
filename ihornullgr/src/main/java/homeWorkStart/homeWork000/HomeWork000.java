package homeWorkStart.homeWork000;

public class HomeWork000 {
    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;

        b = 100 + 27;
        System.out.println(b);
        s = 60000 - 27233;
        System.out.println(s);
        i = 100000 / 2;
        System.out.println(i);
        l = 2147483647L * 2;
        System.out.println(l);

        byte b1 = 43;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        short s1 = 3000;
        short s2 = 4000;
        byte b4 = (byte) ((s1 + s2) / b3);
        System.out.println(b4);

        int i1 = (s2 / s1) * (b1 / b2);
        System.out.println(i1);

        i = s = b;
        System.out.println(b);

        i = s = 44;
        System.out.println(i);
        System.out.println(s);



    }
}

