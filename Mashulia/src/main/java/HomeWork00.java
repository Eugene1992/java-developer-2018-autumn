public class HomeWork00 {
    public static void main(String[] args) {
        int a = 14;
        byte d = 53;
        short s = 1426;
        long l = 362377139L;

        //Task 2
        byte sum = (byte) (d+a);
        //Task 3
        short ded = (short) (s-d);
        //Task 4
        int div = d/a;
        //Task 5
        long mul = l*a;

        //Task 6
        byte FV = (byte) (sum+d);

        //Task 7
        byte s7 = (byte)((s+ded)/FV);

        //Task 8
        int sb = (s/ded)*(sum/d);

        //Task 9
        int g = 16;
        int t = 34;
        int tmp;

        tmp = g;
        g = t;
        t = tmp;

        //Task 10
        int w = 3;
        int p = 5;

        w = w + p;
        p = p - w;
        p = -p;
        w = w - p;


        System.out.println("Task 2: " + sum);
        System.out.println("Task 3: " + ded);
        System.out.println("Task 4: " + div);
        System.out.println("Task 5: " + mul);
        System.out.println("Task 6: " + FV);
        System.out.println("Task 7: " + s7);
        System.out.println("Task 8: " + sb);
        System.out.println("Task 9: g = " + g);
        System.out.println("Task 9: t = " + t);
        System.out.println("Task 10: p = " + p);
        System.out.println("Task 10: w = " + w);

    }
}

/*      1. Создать четыре целочисленные переменные типов byte, short, int, long.
        2. Инициализировать переменную типа byte результатом суммы двух любых чисел
        3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
        4. Инициализировать переменную типа int результатом деления двух любых чисел
        5. Инициализировать переменную типа long результатом умножения двух любых чисел
        6. Передать перменной типа byte результат суммы двух переменных типа byte
        7. Передать переменной типа byte результат суммы двух переменных типа short,
            деленных на третью переменную типа byte
        8. Переменной типа int передать результат деления двух short,
            умноженных на результат деления двух byte
        9. Поменять значения двух целочисленных переменных используя третью
        10. Поменять значения двух переменных без использования третей
*/
