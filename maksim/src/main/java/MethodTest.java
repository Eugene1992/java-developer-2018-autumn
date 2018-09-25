public class MethodTest {
    public static void main(String[] args) {
        printString("Hello world!", 10);
        int res = factorial(5);
        System.out.println(res);

        System.out.println(factorial(5));
    }

    static void printString(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }
}
