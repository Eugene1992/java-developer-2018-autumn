public class Homework3 {
    public static void main(String[] args) {
        // 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        int num1 = 1000;

        while (num1 < 10000) {
            System.out.print(num1 + " ");
            num1 += 3;
        }
        System.out.println();

        // 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        int num2 = 1;

        for (int anyNum1 = 0; anyNum1 < 55; anyNum1++) {
            System.out.print(num2 + " ");
            num2 += 2;
        }

        System.out.println();

        // 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
        int num3 = 90;

        while (num3 >= 0) {
            System.out.print(num3 + " ");
            num3 -= 5;
        }

        System.out.println();

        // 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        int num4 = 2;

        for (int anyNum2 = 0; anyNum2 < 20; anyNum2++) {
            System.out.print(num4 + " ");
            num4 *= 2;
        }

        System.out.println();
        //  5. Выведите на экран первые 20 членов последовательности Фибоначчи.
        int numFi = 1;
        int num5 = 1;

        System.out.print(numFi + " ");

        for (int anyNum3 = 1; anyNum3 < 20; anyNum3++) {
            System.out.print(numFi + " ");
            numFi += num5;
            num5 = numFi - num5;
        }
    }
}