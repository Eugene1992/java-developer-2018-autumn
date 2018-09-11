package java_starter.conditions;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        a++;

        a = a + 1;
        a += 1;

        a =+ 1;

        a -= 1;
        a = a - 1;

        a =- 1;

        int b = 10;
        System.out.println(b--);
        System.out.println(--b);

        int d = 2;
        int e = 10;
        int f = 3;
        int c = e - --d * -f;
        System.out.println(c);
    }
}
